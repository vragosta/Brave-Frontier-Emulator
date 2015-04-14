package charactertest;
import java.io.IOException;
import java.util.Scanner;

//PURPOSE:
public class Arena {
    public void start(Account activeAccount, CharacterDatabase sDatabase, CharacterDatabase pDatabase) throws IOException{
        
        AccountDatabase aDatabase = new AccountDatabase();
        Character winningCharacter = new Character();
        Diagnostics diagx = new Diagnostics();
        
        Scanner stdin = new Scanner(System.in);
        boolean sameCharacter = true;
        boolean winner = false;
        String pos;
        int damageDone, intValue;
        
        aDatabase.addAccountsFromAccountDatabaseFile();
        activeAccount.setUsername(aDatabase.getDatabase().get(0).getUsername());
        activeAccount.setPassword(aDatabase.getDatabase().get(0).getPassword());
        
        pDatabase.print();
        while(true){
            //CHARACTER CHOSEN BY PLAYER(USER)
            System.out.println("Select Character: (Enter position)");
            pos = stdin.next();
            try{
                intValue = Integer.parseInt(pos);
                break;
            }catch(NumberFormatException e){
                System.out.println("Incorrect Input. Please Re-enter the position.");
            }
        }
        
        Character pChosen = pDatabase.getCharacter(intValue);
        System.out.println("Character Chosen: " + pChosen.getName() + "\n");
        
        //ALGORITHMS TO MAKE SURE COMPUTER DOES NOT CHOOSE SAME CHARACTER
        Character sChosen =  new Character();
            while (sameCharacter == true){
                sChosen = sDatabase.getRandomCharacter();
                    if(!sChosen.getName().equals(pChosen.getName()))
                        sameCharacter = false;
            }
            
        //DISPLAY COMBATANTS    
        System.out.println("Arena Battle!\n" + pChosen.getName() + " vs. " + sChosen.getName());
        
        //COMPARE SPEED TO SEE WHO WILL GO FIRST
        boolean playerTurn = checkSpeed(pChosen, sChosen);
        
        do{
            if(playerTurn == true){
                System.out.println("\nPlayer Turn");
                if(calculatingMiss(percentageOfMiss(pChosen, sChosen)) == true)
                    System.out.println(pChosen.getName() + " missed!");
                else{
                    damageDone = damage(pChosen, sChosen);
                    System.out.println(pChosen.getName() + " hit " + damageDone + " damage\n");
                    sChosen.reduceHealth(damageDone);
                    diagx.endTurn(pChosen, sChosen);
                        if(sChosen.checkFainted() == true){
                            System.out.println(sChosen.getName() + " has fainted!");
                            winner = true;
                            winningCharacter = pChosen;
                            activeAccount.incrementWin();
                        }
                }
                playerTurn = !playerTurn;
            }
            else{
                System.out.println("\nEnemy Turn");
                if(calculatingMiss(percentageOfMiss(sChosen, pChosen)) == true)
                    System.out.println(sChosen.getName() + " missed!");
                else{
                    damageDone = damage(sChosen, pChosen);
                    System.out.println(sChosen.getName() + " hit " + damageDone + " damage\n");
                    pChosen.reduceHealth(damageDone);
                    diagx.endTurn(pChosen, sChosen);
                        if(pChosen.checkFainted() == true){
                            System.out.println(pChosen.getName() + " has fainted!");
                            winner = true;
                            winningCharacter = sChosen;
                            activeAccount.incrementLoss();
                        }
                }
                    playerTurn = !playerTurn;
            } 
            
        }while(winner == false);
        
        //ADD EXPERIENCE TO PLAYER CHARACTER IF THEY ARE WINNER
        System.out.println(winningCharacter.getName() + " won!");
            if(winningCharacter == pChosen)
                pChosen.addExperienceFrom(pChosen, sChosen);

        //RESET HEALTHPOOL AND STABILIZE ABILITY OF BOTH CHARACTERS
        pChosen.stabilize();
        sChosen.stabilize();
        
        //CHECK IF THE CHARACTER CAN
        pChosen.levelUp();
        //CHECK IF THE CHARACTER CAN
        pChosen.evolve();
        
        activeAccount.writeToSignInFile();
        
}
    
public boolean checkSpeed(Character pChosen, Character sChosen){
    if(pChosen.getSpeed() < sChosen.getSpeed())
            return false;
        else if(pChosen.getSpeed() == sChosen.getSpeed())
            return true;
        else
            return true;
}
    
public boolean calculatingMiss(double percentageOfMiss){
    double rnd = (Math.random() * 1);
        return rnd > percentageOfMiss;
}    
    
public double percentageOfMiss(Character attackingCharacter, Character defendingCharacter){
    double moveAccuracy = ((double)attackingCharacter.getMove01().getAccuracy()/100.0);
    //System.out.println(moveAccuracy);
    double attackingCharacterAccuracy = ((double)attackingCharacter.getAccuracy()/100.0);
    //System.out.println(attackingCharacterAccuracy);
    double defendingCharacterEvasion = ((double)defendingCharacter.getEvasion()/100.0);
    //System.out.println(defendingCharacterEvasion);
        return moveAccuracy*(attackingCharacterAccuracy/defendingCharacterEvasion);
}
    
public double critical(){
        double criticalArray[] = { 1.0, 1.5};
        int chance = (int) (Math.random() * 2);
            return criticalArray[chance];
    }
    
public double sameTypeAttackBonus(Character attackingCharacter, Character defendingCharacter){
    double STAB;
        if(attackingCharacter.getType() == attackingCharacter.getMove01().getType())
            STAB = 1.5;
        else
            STAB = 1.0;
        return STAB;
}

public double typeAssesment(Character attackingCharacter, Character defendingCharacter){
    double typeAssesment;
    
    if(attackingCharacter.getType() == Type.Fire && defendingCharacter.getType() == Type.Grass)
        typeAssesment = 2.0;
    else if(attackingCharacter.getType() == Type.Fire && defendingCharacter.getType() == Type.Water)
        typeAssesment = 0.50;
    else if(attackingCharacter.getType() == Type.Grass && defendingCharacter.getType() == Type.Fire)
        typeAssesment = .50;
    else if(attackingCharacter.getType() == Type.Grass && defendingCharacter.getType() == Type.Electric)
        typeAssesment = 2.0;
    else if(attackingCharacter.getType() == Type.Water && defendingCharacter.getType() == Type.Fire)
        typeAssesment = 2.0;
    else if(attackingCharacter.getType() == Type.Water && defendingCharacter.getType() == Type.Electric)
        typeAssesment = 0.50;
    else if(attackingCharacter.getType() == Type.Electric && defendingCharacter.getType() == Type.Grass)
        typeAssesment = 0.50;
    else if(attackingCharacter.getType() == Type.Electric && defendingCharacter.getType() == Type.Water)
        typeAssesment = 2.0;
    else if(attackingCharacter.getType() == Type.Light && defendingCharacter.getType() == Type.Dark)
        typeAssesment = 2.0;
    else if(attackingCharacter.getType() == Type.Dark && defendingCharacter.getType() == Type.Light)
        typeAssesment = 2.0;
    else
        typeAssesment = 1.0;
    return typeAssesment;
}

public int damage(Character attackingCharacter, Character defendingCharacter){
        //LEVEL OF THE ATTACKING CHARACTER
        double level = attackingCharacter.getLevel();
        //ATTACK OF THE ATTACKING CHARACTER
        double attack = attackingCharacter.getAttack();
        //DEFENSE OF THE DEFENDING CHARACTER
        double defense = defendingCharacter.getDefense();
        //BASE OF THE ATTACKING CHARACTER RANDOMLY SELECTED MOVE
        double base = attackingCharacter.getRandomMove().getBase();
        System.out.println(attackingCharacter.getName() + " used " + attackingCharacter.getRandomMove().getName() + "!");
        //SAME-TYPE ATTACK BONUS. THIS IS EQUAL TO 1.5 IF THE ATTACK IS OF THE
        //SAME TYPE AS THE USER, AND 1 IF OTHERWISE
        double STAB = sameTypeAttackBonus(attackingCharacter, defendingCharacter);
        //THIS CAN EITHER BE 0, 0.25, 0.50, 1, 2, 4 DEPENDING ON THE TYPE OF ATTACK
        //AND THE TYPE OF THE DEFENDING CHARACTER
        double type = typeAssesment(attackingCharacter, defendingCharacter);
            if(type == 2 || type == 4)
                System.out.println("It's Super Effective!");
            else if(type == 0.25 || type == 0.50)
                System.out.println("It's Not Very Effective.");
        //THIS CAN BE EITHER 1.5 IF CRITICAL OR 1.0 OTHERWISE
        double critical = critical();
            if(critical == 1.5)
                System.out.println("Critical!");
        //THIS CAN BE 0.80 TO 1.2 BASED ON ABILITY OF CHARACTER
        //double ability = 1.2;
        //RANDOM NUMBER FROM 0.85 TO 1.0
        double rand = (Math.random()*.15 + .85);
        //MODIFIER OF THE CHARACTER
        int modifier;
        //RESULT OF THE DAMAGE ALGORITHM
        int damage;
        int damageCalculation;
        
        damage = (int)(((2*level+10)/250)*(attack/defense)*base+2);
        
        //System.out.println(damage + " (damage) = 2 * " + level + " (level) + 10 / 250 * ( " + attack + " (attack) / " + defense + " (defense) ) * " + base + " (base) + 2");
        modifier = (int)(STAB * type * critical * rand);
        //System.out.println(modifier + " (modifier) = " + STAB + " (STAB) * " + type + " (type) * " + critical + " (critical) * " + rand + " (rand)");
            if(modifier == 0)
                modifier = 1;
        
            damageCalculation = (int)damage * (int)modifier;
        //System.out.println("damageCalculation = " + damage + " (damage) * " + modifier + " (modifier)");

        //System.out.println("damageCalculation: "+damageCalculation);
        return damageCalculation;
    }
}

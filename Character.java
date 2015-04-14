package charactertest;

//PURPOSE: CREATE THE VARIABLES AND METHODS ASSOCIATED WITH THE CHARACTER CREATED
public class Character {
        private int identification;
        private String name;
        private Type type;
        private Ability ability;
        private int level;
        private int maxLevel;
        private int healthpool;
        private int attack;
        private int defense;
        private int speed;
        private int recovery;
        private int accuracy;
        private int evasion;
        private int effortPoints;
        private int experience;
        private boolean canEvolve;
        private Nature nature;
        private String family;
        private String bio;
        private CharacterMove move01;
        private CharacterMove move02;
        
//DEFAULT CONSTRUCTOR
public Character(){
        this.identification = 000;
        this.name = "";
        this.type = getRandomType();
        this.ability = getRandomAbility();
        this.level = 0;
        this.maxLevel = 0;
        this.healthpool = 0;
        this.attack = 0;
        this.defense = 0;
        this.speed = 0;
        this.recovery = 0;
        this.accuracy = 0;
        this.evasion = 0;
        this.effortPoints = 0;
        this.experience = 0;
        this.canEvolve = false;
        this.nature = getRandomNature();
        this.family = "";
        this.bio = "";
        this.move01 = new CharacterMove();
        this.move02 = new CharacterMove();
}

//CONSTRUCTOR WITH ALL PARAMETERS
public Character(int identification, String name, Type type, Ability ability, int level, int maxLevel, int healthpool, 
        int attack, int defense, int speed, int recovery, int accuracy, int evasion, int effortPoints, int experience, 
        boolean canEvolve, Nature nature, String family, String bio, CharacterMove move01, CharacterMove move02){
        this.identification = identification;
        this.name = name;
        this.type = type;
        this.ability = ability;
        this.level = level;
        this.maxLevel = maxLevel;
        this.healthpool = healthpool;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.recovery = recovery;
        this.accuracy = accuracy;
        this.evasion = evasion;
        this.effortPoints = effortPoints;
        this.experience = experience;
        this.canEvolve = canEvolve;
        this.nature = nature;
        this.family = family;
        this.bio = bio;
        this.move01 = move01;
        this.move02 = move02;
}

//ACCESSOR METHODS
public int getIdentification(){ return identification; }
public String getName(){ return name; }
public Type getType(){ return type; }
public Ability getAbility(){ return ability; }
public int getLevel(){ return level; }
public int getMaxLevel(){ return maxLevel; }
public int getHealthPool(){ return healthpool; }
public int getAttack(){ return attack; }
public int getDefense(){ return defense; }
public int getSpeed(){ return speed; }
public int getRecovery(){ return recovery; }
public int getAccuracy(){ return accuracy; }
public int getEvasion(){ return evasion; }
public int getEffortPoints(){ return effortPoints; }
public int getExperience() { return experience; }
public boolean getCanEvolve(){ return canEvolve; }
public Nature getNature(){ return nature; }
public String getFamily(){ return family; }
public String getBio(){ return bio; }
public CharacterMove getMove01(){ return move01; }
public CharacterMove getMove02(){ return move02; }

//MUTATOR METHODS
public void setIdentification(int identification){ this.identification = identification; }
public void setName(String name){ this.name = name; }
public void setType(Type type){ this.type = type; }
public void setAbility(Ability ability){ this.ability = ability; }
public void setLevel(int level){ this.level = level; }
public void setMaxLevel(int maxLevel){ this.maxLevel = maxLevel; }
public void setHealthPool(int healthpool){ this.healthpool = healthpool; }
public void setAttack(int attack){ this.attack = attack; }
public void setDefense(int defense){ this.defense = defense; }
public void setSpeed(int speed){ this.speed = speed; }
public void setRecovery(int recovery){ this.recovery = recovery; }
public void setAccuracy(int accuracy){ this.accuracy = accuracy; }
public void setEvasion(int evasion){ this.evasion = evasion; }
public void setEffortPoints(int effortPoints){ this.effortPoints = effortPoints; }
public void setExperience(int experience) { this.experience = experience; }
public void setCanEvolve(boolean canEvolve){ this.canEvolve = canEvolve; }
public void setNature(Nature nature){ this.nature = nature; }
public void setFamily(String family){ this.family = family; }
public void setBio(String bio){ this.bio = bio; }
public void setMove01(CharacterMove move01){ this.move01 = move01; }
public void setMove02(CharacterMove move02){ this.move02 = move02; }

public int getRandomHealthPool(){
    int rnd = 0;
    
    if(this.level < 16)
        rnd = (int)(Math.random()*(13-11)+11);
    else if(this.level >= 16 && this.level < 36)
        rnd = (int)(Math.random()*((77-75)+75));
        
    return rnd;
}

public int getRandomAttack(){
    int rnd = 0;
    
    if(this.level < 16)
        rnd = (int)(Math.random()*(7-5)+5);
    else if(this.level >= 16 && this.level < 36)
        rnd = (int)(Math.random()*(71-69)+69);
    
    return rnd;
}

public int getRandomDefense(){
    int rnd = 0;
    
    if(this.level < 16)
        rnd = (int)(Math.random()*(7-5)+5);
    else if(this.level >= 16 && this.level < 36)
        rnd = (int)(Math.random()*(71-69)+69);
    
    return rnd;
}

public int getRandomSpeed(){
    int rnd = 0;
    
    if(this.level < 16)
        rnd = (int)(Math.random()*(7-5)+5);
    else if(this.level >= 16 && this.level < 36)
        rnd = (int)(Math.random()*(71-69)+69);
    
    return rnd;
}

public int getRandomRecovery(){
    int rnd = 0;
    
    if(this.level < 16)
        rnd = (int)(Math.random()*(7-5)+5);
    else if(this.level >= 16 && this.level < 36)
        rnd = (int)(Math.random()*(71-69)+69);
    
    return rnd;
}

public int getRandomEffortPoints(){
    int rnd = 0;
    
    if(this.level < 16)
        rnd = (int)(Math.random()*(7-5)+5);
    else if(this.level >= 16 && this.level < 36)
        rnd = (int)(Math.random()*(71-69)+69);
    
    return rnd;
}

//RETURNS RANDOM CHARACTER TYPE
public Type getRandomType(){
    Type[] typeArray = { Type.Fire, Type.Water, Type.Grass, Type.Electric, Type.Dark, Type.Light };
    int rnd = (int)(Math.random()*typeArray.length);
    Type typ = typeArray[rnd];
        return typ;
} 
//RETURNS RANDOM CHARACTER ABILITY
public Ability getRandomAbility(){
    Ability[] abilityArray = { Ability.Breaker, Ability.Guardian, Ability.Runner, Ability.Oracle, 
        Ability.Anima, Ability.Lord };
    int rnd = (int)(Math.random() * abilityArray.length);
    Ability abil = abilityArray[rnd];
        return abil;
}

public Nature getRandomNature(){
    Nature[] natureArray = { Nature.Hardy, Nature.Lonely, Nature.Brave, Nature.Bold, Nature.Docile, 
        Nature.Relaxed, Nature.Timid, Nature.Hasty, Nature.Serious };
    int rnd = (int)(Math.random() * natureArray.length);
    Nature nat = natureArray[rnd];
        return nat;
}

//RETURNS RANDOM MOVE
public CharacterMove getRandomMove(){
    CharacterMove[] characterMoveArray = { this.getMove01(), this.getMove02() };
    int rnd = (int)(Math.random() * characterMoveArray.length);
    CharacterMove cMove = characterMoveArray[rnd];
        return cMove;
}

public void natureResolution(){
    //Hardy, Lonely, Brave, Bold, Docile, Relaxed, Timid, Hasty, Serious
    if(Nature.Hardy == this.nature){}
    else if(Nature.Lonely == this.nature){
        this.attack += 2;
        this.defense -= 2;
    }
    else if(Nature.Brave == this.nature){
        this.attack += 2;
        this.speed -= 2;
    }
    else if(Nature.Bold == this.nature){
        this.defense += 2;
        this.attack -= 2;
    }
    else if(Nature.Docile == this.nature){}
    else if(Nature.Relaxed == this.nature){
        this.defense += 2;
        this.speed -= 2;
    }
    else if(Nature.Timid == this.nature){
        this.speed += 2;
        this.attack -= 2;
    }
    else if(Nature.Hasty == this.nature){
        this.speed += 2;
        this.defense -= 2;
    }
    else if(Nature.Serious == this.nature){}
}

//ALLOCATES BONUS STATS UPON SPECIFIED TYPE
public void abilityResolution(){
    if(Ability.Breaker == this.ability)
        this.attack += 4;
    else if(Ability.Guardian == this.ability)
        this.defense += 4;
    else if(Ability.Runner == this.ability)
        this.speed += 4;
    else if(Ability.Oracle == this.ability)
        this.recovery += 4;
    else if(Ability.Anima == this.ability)
        this.healthpool += 4;
    else if(Ability.Lord == this.ability){
        this.healthpool += 1;
        this.attack += 1;
        this.defense += 1;
        this.speed += 1;
        this.recovery += 1;
        }
    }

//DEALLOCATES BONUS STATS UPON SPECIFIED TYPE
public void removeAbilityResolution(){
    if(Ability.Breaker == ability)
        this.attack -= 4;
    else if(Ability.Guardian == ability)
        this.defense -= 4;
    else if(Ability.Runner == ability)
        this.speed -= 4;
    else if(Ability.Oracle == ability)
        this.recovery -= 4;
    else if(Ability.Anima == ability)
        this.healthpool -= 4;
    else if(Ability.Lord == ability){
        this.healthpool -= 1;
        this.attack -= 1;
        this.defense -= 1;
        this.speed -= 1;
        this.recovery -= 1;
        }
}

//REDUCES HEALTHPOOL
public void reduceHealth(int damage){
    this.healthpool -= damage;
    if(healthpool <= 0)
        this.healthpool = 0;
}

//CHECKS IF HEALTHPOOL IS LESS THAN ZERO, IF SO RETURN FALSE
public boolean checkFainted(){
    return healthpool <= 0;
}

public void addExperience(int exp){
    this.experience += exp;
}

//ALGORITHM THAT ALLOCATES EXPERIENCE TO CHARACTER BASED ON DEFEATED CHARACTERS EFFORT POINTS
public void addExperienceFrom(Character character, Character defeatedCharacter){
    int exp = (defeatedCharacter.getEffortPoints()*defeatedCharacter.getLevel());
    System.out.println(character.getName() + " has gained " + exp + " experience points.");
    this.experience += exp;
}

public void stabilize(){
    CharacterDatabase cDatabase = new CharacterDatabase();
    cDatabase.createDatabase();
    
    for(int i = 0; i < cDatabase.getDatabase().size(); i++)
        if(this.getName().equals(cDatabase.getDatabase().get(i).getName())){
            Character databaseCharacter = cDatabase.getDatabase().get(i);
            databaseCharacter.removeAbilityResolution();
            this.healthpool = databaseCharacter.getHealthPool();
    }
    if(this.getAbility() == Ability.Anima || this.getAbility() == Ability.Lord)
        this.abilityResolution();
    
}

public void copy(Character character){
    this.identification = character.getIdentification();
    this.name = character.getName();
    this.maxLevel = character.getMaxLevel();
    this.healthpool += getRandomHealthPool();
    this.attack += getRandomAttack();
    this.defense += getRandomDefense();
    this.speed += getRandomSpeed();
    this.recovery += getRandomRecovery();
    this.accuracy = character.getAccuracy();
    this.evasion = character.getEvasion();
    this.effortPoints += getRandomEffortPoints();
    this.canEvolve = character.getCanEvolve();
    this.bio = character.getBio();
    this.move01 = character.getMove01();
    this.move02 = character.getMove02();
}

public void evolve(){
    Character character;
    CharacterDatabase cDatabase = new CharacterDatabase();
    
    if(this.level == 16 && this.canEvolve == true){
        for(int i = 0; i < cDatabase.getDatabase().size(); i++){
            if(this.getName().equals(cDatabase.getDatabase().get(i).getName())){
                character = cDatabase.getDatabase().get(i+1);
                this.copy(character);
            }
        }
    }
    
    if(this.level == 36 && this.canEvolve == true){
        for(int i = 0; i < cDatabase.getDatabase().size(); i++){
            if(this.getName().equals(cDatabase.getDatabase().get(i).getName())){
                character = cDatabase.getDatabase().get(i+1);
                this.copy(character);
        }
        }
    }
}

//ALGORITHM THAT INCREASES LEVEL AND STATS UPON MEETING LEVEL AND EXPERIENCE REQUIREMENTS
public void levelUp(){
    int n = 12;
    for(int i = 1; i <= 100; i++){
        if(this.level == i && this.experience >= n){
            this.level++;
            System.out.println("Congratulations " + this.getName() + " has reached level " + level);
            //System.out.println("n: " + n);
            this.increaseStats();
            this.experience = this.experience % n;
        }
    n = (n+10);
    }
}

//RANDOMLY SELECTS A NUMBER BETWEEN 2 AND 4 AND ADDS THAT NUMBER TO EACH STAT
public void increaseStats(){
    int[] intArray = {2,3,4};
    int rnd = (int)(Math.random() * 3);
    int n = intArray[rnd];
        this.healthpool += n;
        this.attack += n;
        this.defense += n;
        this.speed += n;
        this.effortPoints += n*2;
        this.abilityResolution();
        this.natureResolution();
        
}

//CONVERTS STATS TO STRING
@Override
public String toString() {
        return ("--------------------\r\n\nID: " + this.getIdentification() + "\r\nName: " + this.getName() + "\r\nType: " + 
                this.getType() + "\r\nAbility: " + this.getAbility() + "\r\nLevel: " + this.getLevel() + "\r\nHealthPool: " +
                this.getHealthPool() + "\r\nAttack: " + this.getAttack() + "\r\nDefense: " + this.getDefense() + "\r\nSpeed: " + 
                this.getSpeed() + "\r\nRecovery: " + this.getRecovery() + "\r\nAccuracy: " + this.getAccuracy() + "\r\nEvasion: " + 
                this.getEvasion() + "\r\nEffort Points: " + this.getEffortPoints() + "\r\nExperience: " + this.getExperience() + "\r\nCanEvolve: " + 
                this.getCanEvolve() + "\r\nNature: " + this.getNature() + "\r\nFamily: " + this.getFamily() + "\r\nBio: " + 
                this.getBio() + "\n\r\nMove01: \n" + this.getMove01() + "\r\nMove02: \n" + this.getMove02() + "\r\n--------------------");
   }

}
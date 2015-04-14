package charactertest;

/*PURPOSE: ALLOWS READABILITY THROUGHOUT THE PROJECT INSIDE YOU WILL 
FIND THE SYSTEM.OUT METHODS CONDENSED INTO METHODS*/
public class Diagnostics {

/*******************
* MENU DIAGNOSTICS *
*******************/

//DISPLAYS MENU
public void displayMenu(){    
    System.out.println("\t\t - - - - - - - - - -");
    System.out.println("\t\t|\tMenu\t    |");
    System.out.println("\t\t| Player Database   |");
    System.out.println("\t\t| Unit Database\t    |");
    System.out.println("\t\t| View Character    |");
    System.out.println("\t\t| Summon Gate\t    |");
    System.out.println("\t\t| Arena\t\t    |");
    System.out.println("\t\t| Manual\t    |");
    System.out.println("\t\t - - - - - - - - - -");
    System.out.println("\t\t|     Quick Tip     |");
    System.out.println("\t\t| Enter (e) to exit |");
    System.out.println("\t\t| Escape Hatch: %   |");
    System.out.println("\t\t - - - - - - - - - -");
}

public void displayManual(){
    System.out.println("\t\t - - - - - - - - - -");
    System.out.println("\t\t|\tManual\t    |");
    System.out.println("\t\t| Ability\t    |");
    System.out.println("\t\t| Nature\t    |");
    System.out.println("\t\t| Type\t\t    |");
    System.out.println("\t\t - - - - - - - - - -");
    System.out.println("\t\t|     Quick Tip     |");
    System.out.println("\t\t| Enter (e) to exit |");
    System.out.println("\t\t| Escape Hatch: %   |");
    System.out.println("\t\t - - - - - - - - - -");
}

public void endTurn(Character pChosen, Character sChosen){
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    System.out.println("End Turn Diagnostics");
    System.out.println(pChosen.getName() + " remaining Healthpool: " + pChosen.getHealthPool());
    System.out.println(sChosen.getName() + " remaining Healthpool: " + sChosen.getHealthPool());
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
}

//DISPLAYS BATTLE TITLE
public void displayBattleTitle(){
    System.out.println("*****************");
    System.out.println("One-On-One Battle");
    System.out.println("*****************");
}

//DISPLAYS PLAYER DATABASE TITLE
public void displayPlayerDatabaseTitle(){
    System.out.println("***************");
    System.out.println("Player Database");
    System.out.println("***************");
}

//DISPLAYS UNIT DATABASE TITLE
public void displayUnitDatabaseTitle(){
    System.out.println("*************");
    System.out.println("Unit Database");
    System.out.println("*************");
}

/********************
* LOGIN DIAGNOSTICS *
********************/

public void displayLogin(){
    System.out.println("\t\t - - - - - - - - - - - -");
    System.out.println("\t\t|\tRegister\t|");
    System.out.println("\t\t|\tLogin\t\t|");
    System.out.println("\t\t - - - - - - - - - - - -");
}
}

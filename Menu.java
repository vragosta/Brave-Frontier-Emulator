package charactertest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//PURPOSE: CREATE A STATE DRIVEN MENU FOR USER INTERACTION
public class Menu {
    
//SWITCH DRIVEN MENU
public void start() throws FileNotFoundException, IOException{
        
        //INSTANTIATE DATABASES
        Account activeAccount = new Account();
        AccountDatabase aDatabase = new AccountDatabase();
        AccountDatabase sDatabase = new AccountDatabase();
        Login login =  new Login();
        Arena arena = new Arena();
        Manual manual = new Manual();
        Diagnostics diagx = new Diagnostics();
        Scanner stdin = new Scanner(System.in);
        CharacterDatabase pDatabase = new CharacterDatabase();
        CharacterDatabase uDatabase = new CharacterDatabase();
        String input;
        
        login.start();
        uDatabase.createDatabase();
        
        sDatabase.addAccountsFromSignInFile();
        activeAccount.setUsername(sDatabase.getDatabase().get(0).getUsername());
        activeAccount.setPassword(sDatabase.getDatabase().get(0).getPassword());
        activeAccount.setNumOfWins(sDatabase.getDatabase().get(0).getNumOfWins());
        activeAccount.setNumOfLosses(sDatabase.getDatabase().get(0).getNumOfLosses());
        activeAccount.setTotalGames(sDatabase.getDatabase().get(0).getTotalGames());
        
        /*aDatabase.addAccountsFromAccountDatabaseFile();
        activeAccount.setUsername(aDatabase.getDatabase().get(0).getUsername());
        activeAccount.setPassword(aDatabase.getDatabase().get(0).getPassword());*/
        
        
        do{
        //DISPLAYS THE MENU
        diagx.displayMenu();
    
        //PROMPTS USER TO ENTER CATEGORY TO BE PROCESSED OBTAINS FIRST CHARACTER OF INPUT
        System.out.print("Enter selection: ");
        input = stdin.next();
        char choice = input.charAt(0);
    
        //USES THAT CHARACTER TO OPERATE THROUGH SWITCH STATEMENT
        switch(choice){
        
            //USER ENTERS P TO PRINT PLAYER DATABASE
            case 'p' | 'P' :
                if(!pDatabase.getDatabase().isEmpty()){
                    diagx.displayPlayerDatabaseTitle();
                    pDatabase.print();
                }
                else {
                    System.out.println("Player Database is empty.");
                }
                break;
            
            //USER ENTERS U TO PRINT UNIT DATABASE
            case 'u' | 'U' :
                if(!uDatabase.getDatabase().isEmpty()){
                    diagx.displayUnitDatabaseTitle();
                    uDatabase.print();
                }
                else
                    System.out.println("Unit Database is empty");
                break;
            
            case 'v' | 'V':
                    System.out.print("Enter Character Name: ");
                    input = stdin.next();
                    int position = uDatabase.getPosition(input);
                        if(position == -1){
                            System.out.println("Character Not Found.");
                            break;
                        }
                        else{
                            System.out.println(uDatabase.getCharacter(position));
                            break;
                        }
            //USER ENTERS S TO ADD CHARACTER FROM UNIT DATABASE TO PLAYER DATABASE
            case 's' | 'S' :
                CharacterDatabase cDatabase = new CharacterDatabase();
                cDatabase.createDatabase();
                pDatabase.addCharacter(cDatabase.getRandomCharacter());
                break;
            
            //IF PLAYER WISHES TO BATTLE THE COMPUTER (ONE ON ONE)
            case 'a' | 'A' :
                diagx.displayBattleTitle();
                if(!pDatabase.getDatabase().isEmpty())
                    arena.start(activeAccount, uDatabase, pDatabase);
                else
                    System.out.println("Player Database is empty");
                break;
            
            case 'm' | 'M' :
                manual.start();
                break;
                
            case 'e' | 'E' :
                System.out.println(activeAccount);
                //activeAccount.saveAccountToFile();
                System.exit(0);
                
            //DEFAULT SET IN CASE OF INCORRECT INPUT
            default:
                if(input.charAt(0) == '%')
                    break;
                else 
                    System.out.println("Please enter again");
                break;
        }
        }while(!"%".equals(input));
    }
}
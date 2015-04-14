package charactertest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//PURPOSE: CREATE/LOGIN TO AN ACCOUNT TO SAVE ALL DATA WHEN USING THE GAME
public class Login{
    public void start()throws FileNotFoundException, IOException{

        //INITIALIZATIONS
        Scanner stdin = new Scanner(System.in);
        Account activeAccount = new Account();
        AccountDatabase aDatabase = new AccountDatabase();
        AccountDatabase sDatabase = new AccountDatabase();
        Diagnostics diagx = new Diagnostics();
        String input, username, password;
        boolean usernameFound, passwordFound, notSame;
        boolean exitLogin = false;
        
        aDatabase.addAccountsFromAccountDatabaseFile();
        sDatabase.addAccountsFromSignInFile();
        //DO WHILE THE INPUT IS NOT E (EXIT)
        do{
        
        //DISPLAYS THE LOGIN
        diagx.displayLogin();
    
        //PROMPTS USER TO ENTER CATEGORY TO BE PROCESSED OBTAINS FIRST CHARACTER OF INPUT
        System.out.print("Enter selection (Enter exit to exit): ");
        input = stdin.next();
        char choice = input.charAt(0);
    
        
        switch(choice){

            case 'r' | 'R' :
                usernameFound = true;
                notSame = false;
                
                do{
                    System.out.print("Username: ");
                    username = stdin.next();
                        if(checkDatabase(aDatabase, username, 'u') == true)
                            System.out.println(username + " has already been taken. Please enter another.");
                        else{
                            usernameFound = false;
                            activeAccount.setUsername(username);
                        }
                }while(usernameFound == true);

                do{
                    System.out.print("Password: ");
                    password = stdin.next();
                        if(password.equals(activeAccount.getUsername()))
                            System.out.println("Your password should not be your username.");
                        else{
                            notSame = true;
                            activeAccount.setPassword(password);
                        }
                }while(notSame == false);
                            
                activeAccount.writeToAccountDatabaseFile();
                aDatabase.addAccount(activeAccount);
                break;
                
            case 'l' | 'L' :
                usernameFound = false;
                passwordFound = false;
                exitLogin = false;
                
                while(usernameFound == false){
                    System.out.print("Username: ");
                    username = stdin.next();
                        if(checkDatabase(aDatabase, username, 'u') == true){
                            activeAccount.setUsername(username);
                            usernameFound = true;
                        }
                        else
                            System.out.println("Username does not exist. Please enter another.");
                }       
                while(passwordFound == false){
                    System.out.print("Password: ");
                    password = stdin.next();
                        if(checkDatabase(aDatabase, password, 'p') == true){
                            activeAccount.setPassword(password);                            
                            passwordFound = true;
                        }
                        else
                            System.out.println("Password does not exist. Please enter another.");
                }
                
                System.out.println("\nAuthentification Successful\n" + activeAccount.getUsername() + " has signed in.\n");
                exitLogin = true;
                break;

            case 'e' | 'E':
                System.out.println(activeAccount.getUsername() + "\n" + activeAccount.getPassword());
                System.exit(1);
            
            case 'p' | 'P':
                printDatabase(aDatabase);
                
            default:
                break;
        }
    
        }while(exitLogin == false);
        activeAccount.setNumOfWins(0);
        activeAccount.setNumOfLosses(0);
        activeAccount.setTotalGames(0);
        activeAccount.writeToSignInFile();
    }

//DISPLAYS ALL THE CHARACTER DATA OF DATABASE
public void printDatabase(AccountDatabase db){
    for(int i = 0; i < db.getDatabase().size(); i++){
        System.out.println("Position: " + i);
        System.out.println("Username: " + db.getDatabase().get(i).getUsername());
        System.out.println("Password: " + db.getDatabase().get(i).getPassword());
        System.out.println("--------------------");
    }
}


public boolean checkDatabase(AccountDatabase ACCOUNTDATABASE, String str, char symbol){
    if(ACCOUNTDATABASE.getDatabase().isEmpty())
        System.out.print("");
    else if(ACCOUNTDATABASE.getDatabase().size() > 0){ 
        if(symbol == 'u'){
            for(int i = 0; i < ACCOUNTDATABASE.getDatabase().size(); i++)
                if(str.equals(ACCOUNTDATABASE.getDatabase().get(i).getUsername()))
                    return true;
        }
        else if(symbol == 'p'){
            for(int i = 0; i < ACCOUNTDATABASE.getDatabase().size(); i++)
                if(str.equals(ACCOUNTDATABASE.getDatabase().get(i).getPassword()))
                    return true;
        }
    }
     return false;
}
}
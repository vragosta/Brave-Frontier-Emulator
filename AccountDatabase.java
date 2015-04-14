package charactertest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountDatabase extends Account{
    private ArrayList<Account> accountDatabase;

//INITIALIZER CONSTRUCTOR
public AccountDatabase() { accountDatabase = new ArrayList<Account>(); }

//ACCESSOR METHOD
public ArrayList<Account> getDatabase(){ return accountDatabase; }

//MUTATOR METHOD
public void setDatabase(ArrayList<Account> accountDatabase){ this.accountDatabase = accountDatabase; }

//METHOD TO ADD ACCOUNT TO DATABASE
public void addAccount(Account account) throws IOException{
    accountDatabase.add(account);
}

//METHOD TO REMOVE USERNAME OR PASSWORD PASSED AS PARAMETER FROM THE DATABASE
public void clearAccount(Account account){
    accountDatabase.remove(account);
}

//METHOD TO CLEAR ENTIRE DATABASE OF ALL LOGIN INFORMATION
public void clearAllAccounts(){
    accountDatabase.clear();
}
 
//READS IN DATA FROM .TXT FILE (NETBEANS PROJECTS) AND ADDS TO DATABASE
public void addAccountsFromAccountDatabaseFile() throws FileNotFoundException, IOException {
    
    File file = new File("AccountDatabaseFile.txt");
        if(!file.exists())
            file.createNewFile();
        
    Scanner stdin = new Scanner(file);
    
    try{
        
        while (stdin.hasNextLine()){
            String username = stdin.next();
            String password = stdin.next();

            this.accountDatabase.add(new Account(username, password, 0, 0, 0));
        }

    }catch(Exception e){
        //System.out.println("Corrupt Data.");
    }
}

public void addAccountsFromSignInFile() throws FileNotFoundException, IOException {
    
    File file = new File("SignInFile.txt");
        if(!file.exists())
            file.createNewFile();
        
    Scanner stdin = new Scanner(file);
    
    try{
        
        while (stdin.hasNextLine()){
            String username = stdin.next();
            String password = stdin.next();
            //int numOfWins = stdin.nextInt();
            //int numOfLosses = stdin.nextInt();
            //int totalGames = stdin.nextInt();

            this.accountDatabase.add(new Account(username, password/*,numOfWins, numOfLosses, totalGames*/));
        }

    }catch(Exception e){
        //System.out.println("Corrupt Data.");
    }
}

//METHOD TO PRINT CONTENTS OF DATABASE
public void print(){
    for(int i = 0; i < this.accountDatabase.size(); i++){
        System.out.println("Position: " + i);
        System.out.println(accountDatabase.get(i));
    }
}

}

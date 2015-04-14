package charactertest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Account {
        private String username;
        private String password;
        private int numOfWins;
        private int numOfLosses;
        private int totalGames;
    
//DEFAULT CONSTRUCTOR        
public Account(){
        this.username = "";
        this.password = "";
        this.numOfWins = 0;
        this.numOfLosses = 0;
        this.totalGames = 0;
}

public Account(String username, String password){
    this.username = username;
    this.password = password;
    this.numOfWins = 0;
    this.numOfLosses = 0;
    this.totalGames = 0;
}

//PARAMETERIZED CONSTRUCTOR
public Account(String username, String password, int numOfWins, int numOfLosses, int totalGames){
        this.username = username;
        this.password = password;
        this.numOfWins = numOfWins;
        this.numOfLosses = numOfLosses;
        this.totalGames = totalGames;
}
    
//ACCESSOR METHODS
public String getUsername() { return username; }
public String getPassword() { return password; }
public int getNumOfWins() { return numOfWins; }
public int getNumOfLosses() { return numOfLosses; }
public int getTotalGames() { return totalGames; }
    
//MUTATOR METHODS
public void setUsername(String username) { this.username = username; }
public void setPassword(String password) { this.password = password; }
public void setNumOfWins(int numOfWins) { this.numOfWins = numOfWins; }
public void setNumOfLosses(int numOfLosses) { this.numOfLosses = numOfLosses; }
public void setTotalGames(int totalGames) { this.totalGames = totalGames; }

//METHODS
public void incrementWin(){
    numOfWins++;
    totalGames++;
}

public void incrementLoss(){
    numOfLosses++;
    totalGames++;
}

public void incrementTotalGames(){
    totalGames++;
}

public void writeToAccountDatabaseFile() throws IOException{
        File fileToWrite = new File("AccountDatabaseFile.txt");
        FileWriter fw = new FileWriter(fileToWrite, true);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                if(!fileToWrite.exists())
                    fileToWrite.createNewFile();
                
                    bw.write(this.getUsername());
                    bw.newLine();
                    bw.write(this.getPassword());
                    bw.newLine();
                
            }catch(Exception e){
                System.out.println("Error occured.");
            }
    }

public void writeToSignInFile() throws IOException{
    File fileToWrite = new File("SignInFile.txt");
    FileWriter fw = new FileWriter(fileToWrite, true);
        try(BufferedWriter bw = new BufferedWriter(fw)){
            if(!fileToWrite.exists())
                fileToWrite.createNewFile();
            
                bw.write(this.getUsername());
                bw.newLine();
                bw.write(this.getPassword());
                bw.newLine();
                bw.write(this.getNumOfWins());
                bw.newLine();
                bw.write(this.getNumOfLosses());
                bw.newLine();
                bw.write(this.getTotalGames());
                bw.newLine();
                
        }catch(Exception e){
            System.out.println("Error Occured.");
        }
}

public void getFromSignInFile() throws FileNotFoundException, IOException{
    File file = new File("SavedAccounts.txt");
        if(!file.exists())
            file.createNewFile();
        
    Scanner stdin = new Scanner(file);
    
    try{
        
        while (stdin.hasNextLine()){
            this.username = stdin.next();
            this.password = stdin.next();
            this.numOfWins = stdin.nextInt();
            this.numOfLosses = stdin.nextInt();
            this.totalGames = stdin.nextInt();
        }

    }catch(Exception e){
        //System.out.println("Corrupt Data.");
    }
}

public void saveAccountToFile() throws IOException{
    File fileToWrite = new File("SavedAccounts.txt");
    FileWriter fw = new FileWriter(fileToWrite, true);
        try(BufferedWriter bw = new BufferedWriter(fw)){
            if(!fileToWrite.exists())
                fileToWrite.createNewFile();
            
                bw.write(this.getUsername());
                bw.newLine();
                bw.write(this.getPassword());
                bw.newLine();
                bw.write(this.getNumOfWins());
                bw.newLine();
                bw.write(this.getNumOfLosses());
                bw.newLine();
                bw.write(this.getTotalGames());
                bw.newLine();
        }catch(Exception e){
            System.out.println("Error Occured.");
        }
}

@Override
public String toString(){
    return ("\nUsername: " + this.username + "\r\nPassword: " + this.password + "\r\nWins: " + this.numOfWins
            + "\r\nLosses: " + this.numOfLosses + "\r\nTotal Games: " + this.totalGames + "\r\n");
}
}
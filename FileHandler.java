package charactertest;
import java.io.File;


//MOVE THE METHODS TO ACCOUNT AND ACCOUNT DATABASE, NOT HERE!!!

public class FileHandler {
    
    private final File file01;
    private final File file02;
    
public FileHandler(){
    this.file01 = new File("SignInFile.txt");
    this.file02 = new File("AccountDatabase.txt");
}

public FileHandler(File file01, File file02){
    this.file01 = file01;
    this.file02 = file02;
}

}

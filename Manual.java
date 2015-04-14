package charactertest;
import java.io.IOException;
import java.util.Scanner;

public class Manual {
public void start() throws IOException{
    Diagnostics diagx = new Diagnostics();
    Menu menu = new Menu();
    Scanner stdin = new Scanner(System.in);
    String input;
        
        //DISPLAYS THE MENU
        diagx.displayManual();
    
        //PROMPTS USER TO ENTER CATEGORY TO BE PROCESSED OBTAINS FIRST CHARACTER OF INPUT
        System.out.print("Enter selection: ");
        input = stdin.next();
        char choice = input.charAt(0);
    
        //USES THAT CHARACTER TO OPERATE THROUGH SWITCH STATEMENT
        switch(choice){
        
            //USER ENTERS P TO PRINT PLAYER DATABASE
            case 'a' | 'A' :
                System.out.println("\n\t\tAbility Chart\n");
                System.out.println("Anima\n\tHealthPool (+4)");
                System.out.println("Breaker\n\tAttack (+4)");
                System.out.println("Guardian\n\tDefense (+4)");
                System.out.println("Lord\n\tAttack (+1) Defense (+1) Recovery (+1) Speed (+1)");
                System.out.println("Oracle\n\tRecovery (+4)");
                System.out.println("Runner\n\tSpeed (+4)");
                break;
            
            //USER ENTERS U TO PRINT UNIT DATABASE
            case 'n' | 'N' :
                System.out.println("\n\t\tNature Chart\n");
                System.out.println("Bold\n\tDefense (+2) Attack (-2)");
                System.out.println("Brave\n\tAttack (+2) Speed (-2)");
                System.out.println("Docile\n\t(+0)");
                System.out.println("Hardy\n\t(+0)");
                System.out.println("Hasty\n\tSpeed (+2) Defense (-2)");
                System.out.println("Lonely\n\tAttack (+2) Defense (-2)");
                System.out.println("Relaxed\n\tDefense (+2) Speed (-2)");
                System.out.println("Serious\n\t(+0)");
                System.out.println("Timid\n\tSpeed (+2) Attack (-2)");
                break;
            
            case 't' | 'T':
                System.out.println("\n\t\tType Chart\n");
                System.out.println("Fire\n\tStrength: Grass\n\tWeakness: Water");
                System.out.println("Water\n\tStrength: Fire\n\tWeakness: Electric");
                System.out.println("Electric\n\tStrength: Water\n\tWeakness: Grass");
                System.out.println("Light\n\tStrength: Dark\n\tWeakness: Dark");
                System.out.println("Dark\n\tStrength: Light\n\tWeakness: Light");
                
            case 'e' | 'E' :
                menu.start();
                
            //DEFAULT SET IN CASE OF INCORRECT INPUT
            default:
                if(input.charAt(0) == '%')
                    break;
                else 
                    System.out.println("Please enter again");
                break;
        }
    }
}

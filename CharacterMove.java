package charactertest;

//PURPOSE: CREATE THE VARIABLES AND METHODS ASSOCIATED WITH THE CHARACTER CREATED
public class CharacterMove {
    private String name;
    private String bio;
    private Type type;
    private int base;
    private int accuracy;

//DEFAULT CONSTRUCTOR
public CharacterMove(){
        this.name = "";
        this.bio = "";
        this.type = Type.Fire;
        this.base = 000;
        this.accuracy = 000;
    }

//CONSTRUCTOR WITH ALL PARAMETERS
public CharacterMove(String name, String bio, Type type, int base, int accuracy){
        this.name = name;
        this.bio = bio;
        this.type = type;
        this.base = base;
        this.accuracy = accuracy;
    }

//ACCESSOR METHODS
public String getName(){ return name; }
public String getBio(){ return bio; }
public Type getType(){ return type; }
public int getBase(){ return base; }
public int getAccuracy(){ return accuracy; }

//MUTATOR METHODS
public void setName(String name){ this.name = name; }
public void setBio(String bio){ this.bio = bio; }
public void setType(Type type){ this.type = type; }
public void setBase(int base){ this.base = base; }
public void setAccuracy(int accuracy){ this.accuracy = accuracy; }

//CONVERTS STATS TO STRING
@Override
public String toString(){
    return ("Name: " + this.getName() +"\r\nBio: " + this.getBio() + "\r\nType: " + 
            this.getType() + "\r\nBase: " + this.getBase() + "\r\nAccuracy: " + this.getAccuracy() + "\r\n");
}
}

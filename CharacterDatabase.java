package charactertest;
import java.util.ArrayList;

//PURPOSE: CREATE A DATA STRUCTURE APPROPRIATE ALONG SIDE APPROPRIATE METHODS TO STORE THE CHARACTERS CREATED
public class CharacterDatabase extends PredefinedCharacter{
    private ArrayList<Character> CharacterDatabase;
    
//INITIALIZER CONSTRUCTOR
public CharacterDatabase() { CharacterDatabase = new ArrayList<Character>(); }

//ACCESSOR METHOD
public ArrayList<Character> getDatabase(){ return CharacterDatabase; }

//MUTATOR METHOD
public void setDatabase(ArrayList<Character> CharacterDatabase){ this.CharacterDatabase = CharacterDatabase; }

//ADDS PRE-CREATED CHARACTERS FROM CHARACTERRAWLIST INTO THE DATA STRUCTURE APPROPRIATE
public void createDatabase(){
    PredefinedCharacter ragnarok = new PredefinedCharacter();
    PredefinedCharacter liandra = new PredefinedCharacter();
    PredefinedCharacter rayden = new PredefinedCharacter();
    ragnarok.createRagnarok();
    liandra.createLiandra();
    rayden.createRayden();
    this.CharacterDatabase.add(ragnarok);
    this.CharacterDatabase.add(liandra);
    this.CharacterDatabase.add(rayden);
}

//ADDS SPECIFIED CHARACTER TO DATABASE
public void addCharacter(Character characterToAdd){
    System.out.println(characterToAdd.getName() + " Obtained!");
    this.CharacterDatabase.add(characterToAdd);
}

//GETS SPECIFIED CHARACTER FROM DATABASE
public Character getCharacter(int pos){
    Character characterToReturn;
    characterToReturn = this.CharacterDatabase.get(pos);
    Type type = this.CharacterDatabase.get(pos).getType();
    characterToReturn.setType(type);
        return characterToReturn;
}

public int getPosition(String name){
    int position = -1;
    for(int i = 0; i < this.CharacterDatabase.size(); i++)
        if(name.equals(this.CharacterDatabase.get(i).getName())){
            position = this.CharacterDatabase.get(i).getIdentification();
            position -= 1;
        }
    return position;
}

//ALTERNATE METHOD TO GET CHARACTER FROM DATABASE USING NAME COMPARISON
public Character getCharacter(String name){
    Character characterToReturn = new Character();
    for(int i = 0; i < this.CharacterDatabase.size(); i++)
        if(name.equals(this.CharacterDatabase.get(i).getName()))
            characterToReturn = this.CharacterDatabase.get(i);
            return characterToReturn;
}

//GETS RANDOM CHARACTER FROM DATABASE
public Character getRandomCharacter(){
    Character characterToReturn;
    int rnd = (int)(Math.random()*this.CharacterDatabase.size());
    characterToReturn = this.CharacterDatabase.get(rnd);
    characterToReturn.natureResolution();
    characterToReturn.abilityResolution();
        return characterToReturn;
}

//METHOD TO REMOVE CHARACTER IN DATABASE
public void removeCharacter(Character character){
    this.CharacterDatabase.remove(character);
}

//METHOD TO CLEAR ENTIRE DATABASE OF ALL CHARACTERS
public void clearCharacters(){
    this.CharacterDatabase.clear();
}

//DISPLAYS ALL THE CHARACTERS OF DATABASE
public void print(){
    for(int i = 0; i < this.CharacterDatabase.size(); i++){
        System.out.println("Position: " + i);
        System.out.println(CharacterDatabase.get(i));
    }
}

}
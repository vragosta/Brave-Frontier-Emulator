package charactertest;
import java.util.ArrayList;

//PURPOSE: CREATE A DATA STRUCTURE APPROPRIATE ALONG SIDE APPROPRIATE METHODS TO STORE THE CHARACTER MOVES CREATED
public class CharacterMoveDatabase extends PredefinedMove {
    private ArrayList<CharacterMove> CharacterMoveDatabase;
    
//INITIALIZER CONSTRUCTOR
public CharacterMoveDatabase(){ CharacterMoveDatabase = new ArrayList<CharacterMove>(); }

//ACCESSOR METHOD
public ArrayList<CharacterMove> getDatabase() { return CharacterMoveDatabase; }

//MUTATOR METHOD
public void setDatabase(ArrayList<CharacterMove> CharacterMoveDatabase){ this.CharacterMoveDatabase = CharacterMoveDatabase; }

//ADDS PRE-CREATED CHARACTER MOVES FROM CHARACTERRAWLIST INTO THE DATA STRUCTURE APPROPRIATE
public void generateDatabase(){

}

//ADDS SPECIFIED CHARACTER MOVE TO DATABASE
public void addCharacterMove(CharacterMove characterMoveToAdd){
    CharacterMoveDatabase.add(characterMoveToAdd);
}

//GETS SPECIFIED CHARACTER MOVE FROM DATABASE USING POSITION COMPARISON
public CharacterMove getCharacterMove(int pos){
    return CharacterMoveDatabase.get(pos);
}

//ALTERNATE METHOD TO GET CHARACTER MOVE FROM DATABASE USING NAME COMPARISON
public CharacterMove getCharacterMove(String name){
    CharacterMove moveToReturn = new CharacterMove();
    for(int i = 0; i < CharacterMoveDatabase.size(); i++)
        if(name.equals(CharacterMoveDatabase.get(i).getName()))
            moveToReturn = CharacterMoveDatabase.get(i);
            return moveToReturn;
}

//RETURNS RANDOM CHARACTER MOVE
public CharacterMove getRandomMove(){
    CharacterMove moveToReturn;
    int rnd = (int)(Math.random() * 5);
    moveToReturn = CharacterMoveDatabase.get(rnd);
        return moveToReturn;
}

//METHOD TO REMOVE CHARACTER MOVE IN DATABASE
public void removeMove(CharacterMove move){
    CharacterMoveDatabase.remove(move);
}

//METHOD TO CLEAR ENTIRE DATABASE OF ALL CHARACTER MOVES
public void clearCharacterMoves(){
    CharacterMoveDatabase.clear();
}

//DISPLAYS ALL THE CHARACTER MOVES OF DATABASE
public void print(){
    for(int i = 0; i < CharacterMoveDatabase.size(); i++)
        System.out.println(CharacterMoveDatabase.get(i));
}

}
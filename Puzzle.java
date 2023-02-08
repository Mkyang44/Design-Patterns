import java.util.*;

public abstract class Puzzle{
    private String name;
    private String material;
    private List<String> pieces;
    
public Puzzle(String name, String material, List<String> pieces){
    this.name = name;
    this.material = material;
    this.pieces = pieces;
}

/**
 * @return
 */
public String assemble(){
    StringBuilder assemble = new StringBuilder();
    assemble.append("putting together " +name);
    assemble.append("This is made up of " +material);
    assemble.append("Now adding some pieces");
    for (String piece : pieces){
        assemble.append("= " +piece);
    }
    return assemble().toString();
}

public String boxPuzzle(){
    return "Putting your " +name + "into a box";
}}
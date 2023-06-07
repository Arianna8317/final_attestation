package Animals.model;
import java.util.*;
public class PackAnimal implements Animal{
    String name;
    String birthday;
    List<String> commands ; 
    String kind  = "";
    public PackAnimal(String name, String birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
    public List<String> getCommands() {
        return commands;
    }
    public String getName(){
        return this.name + " " + this.kind ;
    }
    public void addCommand(String command){
         this.commands.add(command);

    }

}
package Animals.model;
import java.util.*;
public class Pet implements Animal{
    String name;
    Date birthday;
    List<String> commands ; 
    String kind ;
    public Pet(String name, Date birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }
    public List<String> getCommands() {
        return this.commands;
    }
    public String getName(){
        return this.name + " " + this.kind;
    }
    public void addCommand(String command){
        this.commands.add(command);
    }
}

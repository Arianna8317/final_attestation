package Animals.model;
import java.util.*;
public class Camel extends PackAnimal{
    
    public Camel(String name, Date birthday, List<String> commands ){
        super(name, birthday, commands);
        this.kind = "Верблюд";
    } 
}

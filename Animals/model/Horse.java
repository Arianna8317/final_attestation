package Animals.model;
import java.util.*;
public class Horse extends PackAnimal{

    public Horse(String name, Date birthday, List<String> commands ){
        super(name, birthday, commands);
        this.kind = "Лошадь" ;
        
    } 
}

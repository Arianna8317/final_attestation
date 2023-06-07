package Animals.model;
import java.util.*;
public class Dog extends Pet{
    
    public Dog(String name, Date birthday, List<String> commands) {
        super(name, birthday, commands);
        this.kind = "Собака";
        
    } 
}


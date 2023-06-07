package Animals.model;
import java.util.*;
public class Cat extends Pet{
    private boolean ifBold ; // 

    public Cat(String name, Date birthday, List<String> commands, Boolean ifBold ){
        super(name, birthday, commands);
        this.ifBold = ifBold ;
        this.kind = "Кошка";
    } 
}

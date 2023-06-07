package Animals.view;
import Animals.model.*;

public class AnimalView {
    private Animal animal; 
    public AnimalView(Animal animal ){
        this.animal = animal ;
    }
    public void showAllCommands(){
        int count  = 1 ;
        for (String command: animal.getCommands()) {
         System.out.printf("%d ) %s \n", count++, command);
        }
     }

}

package Animals.model;
import java.util.*;

public class AnimalCollection {

    private List<Animal> animals;
    
    public AnimalCollection(List<Animal> animals) {
        this.animals = animals;
    }

    public boolean deleteAnimal(String name){
       
        boolean flag = false;
        for ( Animal animal: this.animals)  {
           if (animal.getName().equals(name)) { 
               animals.remove(animal);
               flag = true;
               break;    
            }   
        }       
        return flag;
    };

    public void addAnimal(Animal animal){
     
        this.animals.add(animal);
    };

    public Animal findAnimal(String name){
       
        for ( Animal animal: this.animals)  {
            if (animal.getName().equals(name)) { 
                return animal;
        
         
             }   
         }       
        return this.animals.get(0); // заглушка
    }
    public List<Animal> getAnimals() {
        return animals;
    };
}



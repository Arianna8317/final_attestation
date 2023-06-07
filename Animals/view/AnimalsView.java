package Animals.view;
import Animals.model.AnimalCollection;
import Animals.model.Animal;

public class  AnimalsView{
    
    private AnimalCollection animalCollection ;
    public AnimalsView(AnimalCollection animalCollection) {
        this.animalCollection = animalCollection;
    }
    public void showAllAnimals(){
       int count  = 1 ;
       for (Animal animal: animalCollection.getAnimals() ) {
        System.out.printf("%d ) %s \n", count++, animal.getName());
       }
    }
}
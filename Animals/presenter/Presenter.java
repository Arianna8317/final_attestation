package Animals.presenter;
import java.util.*;

import Animals.model.*;
import Animals.view.*;

public class Presenter {
    private AnimalCollection animals;

    public Presenter(AnimalCollection animals ) {
        this.animals = animals;
    }
    
    public void run()  {
        boolean flag = true;
        while (flag) {
            System.out.println("Выберите пункт меню: \n" +
                    "[1] - список всех животных\n" +
                    "[2] - добавить животное\n" +
                    "[3] - удалить животное\n" +
                    "[4] - найти животное\n" +
                    "[5] - добавить командут\n" +
                    "[6] - удалить команду\n"  +
                    "[0] - выход из приложения.");
            Scanner input = new Scanner(System.in);
            while (input.hasNextLine()) {
                int n = input.nextInt();
                switch (n) {
                    case 1:
                        AnimalsView view1 = new AnimalsView(animals);
                        view1.showAllAnimals();
                        break;
                    case 2:
                        System.out.println("Имя животного, которого надо добавить : ");
                        String nameA = input.nextLine();
                        System.out.println(nameA);
                        animals.addAnimal(nameA);
                        AnimalsView view2 = new AnimalsView(animals);
                        view2.showAllAnimals();
                        break;
                    case 3:
                        System.out.println("Имя животного, которого надо удалить : ");
                        String nameD = input.nextLine();
                        if (animals.deleteAnimal(nameD)){
                            System.out.printf("Животное %s успешно удалено !", nameD);
                            AnimalsView view3 = new AnimalsView(animals);
                            view3.showAllAnimals();
                        }    
                        break;
                    case 4:
                        System.out.println("Имя животного, которого надо найти : ");
                        String nameF = input.nextLine();
                        AnimalView view3 = new AnimalView(animals.findAnimal(nameF));
                        ///view3.showAllAnimals();
                        
                        break;   
                    case 0:
                        System.out.println("Работа завершена");
                        flag = false;
                        break;
                }
            }
            input.close();
        }

    }
}



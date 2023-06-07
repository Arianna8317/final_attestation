package Animals;
import Animals.model.*;
import Animals.presenter.*;
import java.util.*;

import Animals.model.Hamster;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Рекс", "12.09.2010", "Ко мне!"));
        animals.add(new Cat("Мурзик", "23.09.2022", "Кушать!"));
        animals.add(new Camel("Валя","12.09.2023", "Идти!"));
        animals.add(new Hamster("Луша", "12.09.2010", "Голос!"));
        animals.add(new Donkey("Бусик", "23.09.2022", "Вези!"));
        animals.add(new Camel("Валя","12.09.2023", "Идти!"));
        animals.add(new Horse("Молния","12.07.2022", "НООО!"));
        Presenter presenter = new Presenter ( animals);
        presenter.run();

    }
}

package Animals;
import Animals.model.*;
import Animals.presenter.*;
import java.util.*;

import Animals.model.Hamster;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        
        List<String> list1 = new ArrayList<>();
        list1.add("Ко мне");
        list1.add("Голос!");
        list1.add("Лежать!");
        List<String> list2 = new ArrayList<>();
        list2.add("Вези!");
        list2.add("Стоять!!");
        list2.add("Спать!");
        List<String> list3 = new ArrayList<>();
        list3.add("Кушать!");
        list3.add("Играть!!");
        list3.add("Лежать!");
        
        
        animals.add(new Dog("Рекс","12.09.2010", list1));
        animals.add(new Cat("Мурзик", "23.09.2022", list3 , false));
        animals.add(new Camel("Валя","12.09.2023",list2));
        animals.add(new Hamster("Луша", "12.09.2010",list3));
        animals.add(new Donkey("Бусик", "23.09.2022", list2));
        animals.add(new Camel("Валя","12.09.2023", list2));
        list2.add("Ноо!");
        animals.add(new Horse("Молния","12.07.2022", list2));

        Presenter presenter = new Presenter ( new AnimalCollection(animals));
        presenter.run();

    }
}

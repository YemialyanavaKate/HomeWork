package home_work_5.utils;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ListUtils {
    public static List<Person> PersonListRandome(int size) {
        List<Person> list = new LinkedList<>();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        String[] arrName = new String[5];
        arrName[0] = "Ваня";
        arrName[1] = "Катя";
        arrName[2] = "Тина";
        arrName[3] = "Саша";
        arrName[4] = "Тим";

        for (int i = 0; i < size; i++) {
             Person person = new Person(
                     String.valueOf(rnd.nextInt()),
                     String.valueOf(rnd.nextInt(10_000, 2_147_000_000)),
                     String.valueOf(randomNick(arrName))
            );
            list.add(i, person);
        }
        return list;
    }

    public static String randomNick(String arrNickAnimal[]){
        Random rand = new Random();
        int i = rand.nextInt(5);
        return arrNickAnimal[i];
    }

    public static List<Animal> AnimalListRandome(int size) {

        List<Animal> list = new ArrayList<>();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        String[] arrNickAnimal = new String[5];
        arrNickAnimal[0] = "Арнольд";
        arrNickAnimal[1] = "Барсик";
        arrNickAnimal[2] = "Тина";
        arrNickAnimal[3] = "Мира";
        arrNickAnimal[4] = "Брюс";

        for (int i = 0; i < size; i++) {
            Animal animal = new Animal(
                    rnd.nextInt(1, 15),
                    randomNick(arrNickAnimal)
            );
            list.add(i, animal);
        }
        return list;
    }
}

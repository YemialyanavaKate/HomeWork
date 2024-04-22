package home_work_5.utils;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SetUtils {
    public static Set<Person> personHashSetRandome(int size) {
        Set<Person> data = new HashSet<>();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        String abc = "abcdefjhijklmnopqrstyvwxyz";

        String[] arrName = new String[5];
        arrName[0] = "Ваня";
        arrName[1] = "Катя";
        arrName[2] = "Тина";
        arrName[3] = "Саша";
        arrName[4] = "Тим";

        for (int i = 0; i < size; i++) {
             Person person = new Person(
                     String.valueOf(randomNumberABC(abc)),
                     String.valueOf(rnd.nextInt(10_000, 2_147_000_000)),
                     String.valueOf(randomNickOrName(arrName))
            );
            data.add(person);
        }
        return data;
    }

    public static String randomNumberABC(String abc) {
        String nickRandomABC = "";

        for (int i = 0; i <= 6; i++) {
            Random rand = new Random();
            int j = rand.nextInt(25);
            nickRandomABC += abc.charAt(j);
        } return nickRandomABC;
    }

    public static String randomNickOrName(String arrNickAnimal[]){
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
                    randomNickOrName(arrNickAnimal)
            );
            list.add(i, animal);
        }
        return list;
    }
}
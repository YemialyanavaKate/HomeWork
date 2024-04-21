package home_work_5.utils;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class MapUtils {

    public static Map<String, Person> PersonRandome(int size) {
        Map<String, Person> map = new HashMap<>();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        for (int i = 0; i < size; i++) {
            Person person = new Person(
                    String.valueOf(rnd.nextInt()),
                    String.valueOf(rnd.nextInt()),
                    String.valueOf(rnd.nextInt())
            );
            Person put = map.put(person.getName(), person);
        }
        return map;
    }

    public static Map<String, Animal> AnimalRandome(int size) {
        Map<String, Animal> map = new HashMap<>();

        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        for (int i = 0; i < size; i++) {
            Animal animal = new Animal(
                    rnd.nextInt(1, 15),
                    String.valueOf(rnd.nextInt())
            );
            Animal put = map.put(animal.getNick(), animal);
        }
        return map;
    }
}
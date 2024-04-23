package home_work_5.utils;

import home_work_5.dto.Animal;
import home_work_5.dto.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SetUtils {
    public static Set<Person> personHashSetRandom(int size) {
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
        StringBuilder nickRandomABC = new StringBuilder();

        for (int i = 0; i <= 6; i++) {
            Random rand = new Random();
            int j = rand.nextInt(25);
            nickRandomABC.append(abc.charAt(j));
        } return nickRandomABC.toString();
    }

    public static String randomNickOrName(String[] arrNickAnimal){
        Random rand = new Random();
        int i = rand.nextInt(5);
        return arrNickAnimal[i];
    }

    public static Set<Animal> animalTreeSetRandom(int size) throws FileNotFoundException {

        Set<Animal> data = new TreeSet<>();

        String[] arrNickAnimal = new String[6];

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Nick.txt"));

            String line;
            for (int j = 0; j < arrNickAnimal.length; j++) {
                while ((line = reader.readLine()) != null){
                    arrNickAnimal[j] = line;
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Нет такого файла");
        } catch (IOException e){
            System.out.println("Ошибка чтения файла");
        }
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        for (int i = 0; i < size; i++) {
            Animal animal = new Animal(
                    rnd.nextInt(1, 15),
                    randomNickOrName(arrNickAnimal)
            );
            data.add(animal);
        }
        return data;
    }
}

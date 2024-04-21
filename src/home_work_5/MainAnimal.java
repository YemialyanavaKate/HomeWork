package home_work_5;

import home_work_5.comparators.ComparatorAge;
import home_work_5.comparators.ComparatorNicK;
import home_work_5.dto.Animal;
import home_work_5.utils.ListUtils;
import home_work_5.utils.MapUtils;

import java.util.*;

public class MainAnimal {
    public static void main(String[] args) {
        Map<String, Animal> mapWithAnimal = MapUtils.AnimalRandome(5);
        System.out.println(mapWithAnimal);

        Collection<Animal> values = mapWithAnimal.values();

        for (Animal datum : values) {
            System.out.println(datum);
        }

        String operation1 = "Заполнение коллекции";
        long start1 = System.currentTimeMillis();

        List<Animal> list1 = ListUtils.AnimalListRandome(1_000_000);
        long stop1 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation1 + ". Заняла " + (stop1 - start1) + " мс");

        /*System.out.println("До сортировки");
        for (Animal datum : list1) {
            System.out.println(datum);
        }
        System.out.println("____________________");*/
        list1.sort(new ComparatorAge());
        list1.sort(new ComparatorNicK());
        /*System.out.println("После сортировки");
        for (Animal datum : list1) {
            System.out.println(datum);
        }*/

        String operation2 = "Итерирование коллекции";
        long start2 = System.currentTimeMillis();
        Iterator<Animal> iterator = list1.iterator();
        while (iterator.hasNext()){
            Animal next = iterator.next();
        }
        long stop2 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation2 + ". Заняла " + (stop2 - start2) + " мс");

        String operation3 = "Удаление всех элементов коллекции";
        long start3 = System.currentTimeMillis();

        while (iterator.hasNext()){
            Animal next = iterator.next();
            iterator.remove();
        }
        long stop3 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation3 + ". Заняла " + (stop3 - start3) + " мс");

     }
}

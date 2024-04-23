package home_work_5;

import home_work_5.comparators.ComparatorAge;
import home_work_5.comparators.ComparatorNicK;
import home_work_5.comparators.ComparatorPassword;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.utils.ListUtils;
import home_work_5.utils.MapUtils;
import home_work_5.utils.SetUtils;
import home_work_5.utils.SortUtils;

import java.io.FileNotFoundException;
import java.util.*;

public class MainAnimal {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Animal> mapWithAnimal = MapUtils.animalRandome(5);
        System.out.println(mapWithAnimal);

        Collection<Animal> values = mapWithAnimal.values();

        for (Animal datum : values) {
            System.out.println(datum);
        }

        String operation1 = "Заполнение коллекции ArrayList";
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

        String operation3 = "Удаление всех элементов коллекции при помощи iterator.remove()";
        long start3 = System.currentTimeMillis();

        while (iterator.hasNext()){
            Animal next = iterator.next();
            iterator.remove();
        }
        long stop3 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation3 + ". Заняла " + (stop3 - start3) + " мс");


        System.out.println("Для Animal в TreeSet");

        long start4 = System.currentTimeMillis();
        Set<Animal> data1 = SetUtils.animalTreeSetRandom(10);
        long stop4 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation1 + ". Заняла " + (stop4 - start4) + " мс");

        for (Animal datum : list1) {
            System.out.println(datum);
        }
       // SortUtils.sortSet(new ComparatorAge(), data1);


        long start5 = System.currentTimeMillis();
        Iterator<Animal> iteratorSetAnimal = data1.iterator();
        while (iteratorSetAnimal.hasNext()){
            Animal next = iteratorSetAnimal.next();
        }
        long stop5 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation2 + ". Заняла " + (stop5 - start5) + " мс");

        String operation4 = "Удаление всех элементов коллекции при помощи clear()";
        long start6 = System.currentTimeMillis();
        data1.clear();
        long stop6 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation4 + ". Заняла " + (stop6 - start6) + " мс");

        for (Animal datum : data1) {
            System.out.println(datum);
        }
     }
}

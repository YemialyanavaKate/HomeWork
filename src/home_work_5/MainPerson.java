package home_work_5;

import home_work_5.comparators.ComparatorNicK;
import home_work_5.comparators.ComparatorPassword;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.utils.ListUtils;
import home_work_5.utils.MapUtils;
import home_work_5.utils.SetUtils;

import java.util.*;
import java.util.stream.Collectors;

public class MainPerson {
    public static void main(String[] args) {

        System.out.println("Для Persons в LinkedList");
        String operation1 = "Заполнение коллекции";
        long start1 = System.currentTimeMillis();

        List<Person> list2 = ListUtils.PersonListRandome(1_000_000);

        long stop1 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation1 + ". Заняла " + (stop1 - start1) + " мс");

        /*System.out.println("До сортировки");
        for (Person datum : list2) {
            System.out.println(datum);
        }
        System.out.println("____________________");*/
        list2.sort(new ComparatorPassword());
        SortUtils.sort(new ComparatorPassword(), list2);
        /*System.out.println("После сортировки");
        for (Person datum : list2) {
            System.out.println(datum);
        }*/

        String operation2 = "Итерирование коллекции";
        long start2 = System.currentTimeMillis();
        Iterator<Person> iterator = list2.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
        }
        long stop2 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation2 + ". Заняла " + (stop2 - start2) + " мс");

        String operation3 = "Удаление всех элементов коллекции iterator";
        long start3 = System.currentTimeMillis();
        Iterator<Person> iteratorPerson = list2.iterator();
        while (iteratorPerson.hasNext()){
            Person next = iteratorPerson.next();
            iteratorPerson.remove();
        }

        long stop3 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation3 + ". Заняла " + (stop3 - start3) + " мс");


        System.out.println("Для Persons в HashSet");

        long start4 = System.currentTimeMillis();
        Set<Person> data1 = SetUtils.personHashSetRandome(1_000_000);
        long stop4 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation1 + ". Заняла " + (stop4 - start4) + " мс");


        //data1.stream().sorted().collect(Collectors.toSet());
        //Collections.sort(data1, new ComparatorPassword());


        long start5 = System.currentTimeMillis();
        Iterator<Person> iteratorSetPerson = data1.iterator();
        while (iteratorSetPerson.hasNext()){
            Person next = iteratorSetPerson.next();
        }
        long stop5 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation2 + ". Заняла " + (stop5 - start5) + " мс");

        String operation4 = "Удаление всех элементов коллекции при помощи clear()";
        long start6 = System.currentTimeMillis();
        data1.clear();
        long stop6 = System.currentTimeMillis();
        System.out.println("Операция: "  + operation4 + ". Заняла " + (stop6 - start6) + " мс");

        for (Person datum : data1) {
            System.out.println(datum);
        }

    }
}

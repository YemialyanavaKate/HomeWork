package home_work_5;

import home_work_5.comparators.ComparatorNicK;
import home_work_5.comparators.ComparatorNickPerson;
import home_work_5.comparators.ComparatorPassword;
import home_work_5.dto.Person;
import home_work_5.utils.ListUtils;
import home_work_5.utils.SetUtils;
import home_work_5.utils.SortUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPerson {
    private static final String FILL_COLLECTION = "Заполнение коллекции";
    private static final String ITERATE_COLLECTION = "Итерирование коллекции";
    private static final String DELETE_COLLECTION = "Удаление всех элементов коллекции iterator";
    public static void main(String[] args) {

        System.out.println("Для Persons в LinkedList");
        long start1 = System.currentTimeMillis();

        List<Person> list2 = ListUtils.PersonListRandome(10);

        long stop1 = System.currentTimeMillis();
        System.out.println("Операция: "  + FILL_COLLECTION + ". Заняла " + (stop1 - start1) + " мс");

        System.out.println("До сортировки");
        for (Person datum : list2) {
            System.out.println(datum);
        }
        System.out.println("____________________");

       /*list2.stream()
               .sorted(new ComparatorPassword())
                       //.sorted(new ComparatorNickPerson())
                               .collect(Collectors.toList());
*/
       // Runnable runnable = () -> list2.sort(new ComparatorPassword());
        list2.sort(new ComparatorPassword());
        list2.sort(new ComparatorNickPerson());

        System.out.println("После сортировки");
        for (Person datum : list2) {
            System.out.println(datum);
        }

        long start2 = System.currentTimeMillis();
        Iterator<Person> iterator = list2.iterator();
        while (iterator.hasNext()){
            Person next = iterator.next();
        }
        long stop2 = System.currentTimeMillis();
        System.out.println("Операция: "  + ITERATE_COLLECTION + ". Заняла " + (stop2 - start2) + " мс");

        long start3 = System.currentTimeMillis();
        Iterator<Person> iteratorPerson = list2.iterator();
        while (iteratorPerson.hasNext()){
            Person next = iteratorPerson.next();
            iteratorPerson.remove();
        }

        long stop3 = System.currentTimeMillis();
        System.out.println("Операция: "  + DELETE_COLLECTION + ". Заняла " + (stop3 - start3) + " мс");


        System.out.println("Для Persons в HashSet");

        long start4 = System.currentTimeMillis();
        Set<Person> data1 = SetUtils.personHashSetRandom(10);
        long stop4 = System.currentTimeMillis();
        System.out.println("Операция: "  + FILL_COLLECTION + ". Заняла " + (stop4 - start4) + " мс");

        List<Person> listSet = new ArrayList<>(data1);

        System.out.println("До сортировки");
        for (Person datum : listSet) {
            System.out.println(datum);
        }
        System.out.println("____________________");

        listSet.sort(new ComparatorNickPerson());
        SortUtils.sort(new ComparatorPassword(), listSet);
        System.out.println("После сортировки");
        for (Person datum : listSet) {
            System.out.println(datum);
        }

        long start5 = System.currentTimeMillis();
        Iterator<Person> iteratorSetPerson = data1.iterator();
        while (iteratorSetPerson.hasNext()){
            Person next = iteratorSetPerson.next();
        }
        long stop5 = System.currentTimeMillis();
        System.out.println("Операция: "  +ITERATE_COLLECTION + ". Заняла " + (stop5 - start5) + " мс");

        long start6 = System.currentTimeMillis();
        data1.clear();
        long stop6 = System.currentTimeMillis();
        System.out.println("Операция: "  + DELETE_COLLECTION + ". Заняла " + (stop6 - start6) + " мс");

        for (Person datum : data1) {
            System.out.println(datum);
        }

    }
}

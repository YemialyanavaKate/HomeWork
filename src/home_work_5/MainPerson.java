package home_work_5;

import home_work_5.comparators.ComparatorNicK;
import home_work_5.dto.Animal;
import home_work_5.dto.Person;
import home_work_5.utils.ListUtils;
import home_work_5.utils.MapUtils;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MainPerson {
    public static void main(String[] args) {

       /* Map<String, Person> mapWithPerson = MapUtils.PersonRandome(5);
        System.out.println(mapWithPerson);

        Collection<Person> values = mapWithPerson.values();

        for (Person datum : values) {
            System.out.println(datum);
        }*/

        List<Person> list2 = ListUtils.PersonListRandome(5);
        System.out.println("До сортировки");
        for (Person datum : list2) {
            System.out.println(datum);
        }
       /* System.out.println("____________________");
        list2.sort(new ComparatorNicK());
        System.out.println("После сортировки");
        for (Person datum : list2) {
            System.out.println(datum);
        }*/
     }
}

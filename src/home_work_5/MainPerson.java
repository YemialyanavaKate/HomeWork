package home_work_5;

import home_work_5.dto.Person;
import home_work_5.utils.MapUtils;

import java.util.Collection;
import java.util.Map;

public class MainPerson {
    public static void main(String[] args) {

        Map<String, Person> mapWithPerson = MapUtils.PersonRandome(5);
        System.out.println(mapWithPerson);

        Collection<Person> values = mapWithPerson.values();

        for (Person datum : values) {
            System.out.println(datum);
        }

     }
}

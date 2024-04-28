package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorAgeAndNickAnimal {

    public static int compare(Animal o1, Animal o2) {
        if (o1.getAge() == o2.getAge()){
            return o1.getNick().compareTo(o2.getNick());
        }
        return o1.getAge() - o2.getAge();
    }
}

package home_work_5.comparators;

import home_work_5.dto.Animal;

import java.util.Comparator;

public class ComparatorNicK implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1 == null && o2 == null){
            return 0;
        }

        if(o1 == null && o2 != null){
            return -1;
        }

        if(o1 != null && o2 == null){
            return 1;
        }

        return o1.getNick().compareTo(o2.getNick());
    }
}

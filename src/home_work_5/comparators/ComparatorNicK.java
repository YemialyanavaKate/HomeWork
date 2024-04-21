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

    /*@Override
    public int compare(Animal o1, Animal o2) {
        char firstCharO1 = o1.charAt(0);
        char firstCharO2 = o2.charAt(0);
        return (int) firstCharO1 - (int) firstCharO2;
    }*/
}

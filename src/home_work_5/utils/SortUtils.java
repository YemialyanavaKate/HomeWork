package home_work_5.utils;

import home_work_5.comparators.ComparatorAge;
import home_work_5.dto.Animal;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class SortUtils {

    public static <T> void sort(Comparator<T> cmp, List<T> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = (list.size() - 1); j > i; j--) {
                if (cmp.compare(list.get(j-1), list.get(j)) > 0) {
                    T temp = list.get(j - 1);
                    list.set((j - 1),list.get(j));
                    list.set((j),temp);
                }
            }
        }
    }

    /*public static void sort(ComparatorAge comparatorAge, Set<Animal> set) {
        for (int i = 0; i < set.size() - 1; i++) {
            for (int j = i + 1; j < set.size(); j++) {
                if (set.iterator().hasNext()){
                    T left = set.iterator().next();
                    set.iterator().
                }
                if (cmp.compare(set.iterator().hasNext()
                        get(j-1), list.get(j)) > 0) {
                    T temp = list.get(j - 1);
                    list.set((j - 1),list.get(j));
                    list.set((j),temp);
                }
            }
        }

    }*/

    /*public static <T> void sortSet(Comparator<T> cmp, Set<T> set){
        for (int i = 0; i < set.size() - 1; i++) {
            for (int j = i + 1; j < set.size(); j++) {
                if (set.iterator().hasNext()){
                    T left = set.iterator().next();
                }
                if (cmp.compare(set.iterator().hasNext()
                        get(j-1), list.get(j)) > 0) {
                    T temp = list.get(j - 1);
                    list.set((j - 1),list.get(j));
                    list.set((j),temp);
                }
            }
        }
    }*/

    /*public static <T> void sort(Comparator<T> cmp, Collection<T> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = (list.size() - 1); j > i; j--) {
                if (cmp.compare(list.iterator().hasNext(), list.get(j)) > 0) {
                    T temp = list.get(j - 1);
                    list.set((j - 1),list.get(j));
                    list.set((j),temp);
                }
            }
        }
    }*/

}

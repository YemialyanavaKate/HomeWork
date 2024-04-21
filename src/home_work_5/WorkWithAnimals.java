package home_work_5;

import home_work_5.dto.Animal;

import java.util.Comparator;
import java.util.List;

public class WorkWithAnimals {


    public void sort(Comparator<T> cmp, List<T> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = (list.size() - 1); j > i; j--) {
                if (cmp.compare(list.get(i-1), list.get(j)) > 0) {
                    T temp = list.get(j - 1);
                    list.get(j - 1) = list.get(j);
                    list.get(j) = temp;
                }
            }
        }


    }

}

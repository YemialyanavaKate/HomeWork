package home_work_5.comparators;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      /*  if(o1 == null && o2 == null){
            return 0;
        }

        if(o1 == null && o2 != null){
            return -1;
        }

        if(o1 != null && o2 == null){
            return 1;
        }*/

        return o1 - o2;
    }

}

package home_work_4.dto;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }

}

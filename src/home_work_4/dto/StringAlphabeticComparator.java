package home_work_4.dto;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        char firstCharO1 = o1.charAt(0);
        char firstCharO2 = o2.charAt(0);
        return (int) firstCharO1 - (int) firstCharO2;
    }
}

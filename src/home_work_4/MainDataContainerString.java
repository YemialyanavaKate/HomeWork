package home_work_4;

import home_work_4.dto.DataContainer;
import home_work_4.dto.StringAlphabeticComparator;
import home_work_4.dto.StringLengthComparator;

public class MainDataContainerString {
    public static void main(String[] args) {
        String[] data1 = new String[4];
        DataContainer<String> container = new DataContainer<>(data1);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);
        container.delete(text1);
        System.out.println(container.get(index1));
        container.sort(new StringLengthComparator());
        System.out.println(container);
        container.sort(new StringAlphabeticComparator());
        System.out.println(container);

    }
}


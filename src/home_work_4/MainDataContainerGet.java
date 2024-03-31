package home_work_4;

import home_work_4.dto.DataContainer;

public class MainDataContainerGet {
    public static void main(String[] args) {

        Integer[] data5_1 = {};
        DataContainer<Integer> container5 = new DataContainer<>(data5_1);
        int indexContainer5 = container5.add(9999);
        Integer value = container5.get(indexContainer5);
        System.out.println(value);

        Integer value1 = container5.get(1);
        System.out.println(value1);
    }
}


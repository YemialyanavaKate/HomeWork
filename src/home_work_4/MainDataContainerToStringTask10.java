package home_work_4;

import home_work_4.dto.DataContainer;

public class MainDataContainerToStringTask10 {
    public static void main(String[] args) {

        Integer[] data10_1 = {1, 2, 3, 777, 3};
        DataContainer<Integer> container10_1 = new DataContainer<>(data10_1);
        System.out.println(container10_1);

        Integer[] data10_2 = {1, 2, 3, null};
        DataContainer<Integer> container10_2 = new DataContainer<>(data10_2);
        System.out.println(container10_2);

        Integer[] data10_3 = {};
        DataContainer<Integer> container10_3 = new DataContainer<>(data10_3);
        System.out.println(container10_3);
    }

}

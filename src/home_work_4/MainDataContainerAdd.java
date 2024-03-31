package home_work_4;

import home_work_4.dto.DataContainer;

public class MainDataContainerAdd {
    public static void main(String[] args) {
        Integer[] data4_1 = {1, 2, 3, null, null, null};
        DataContainer<Integer> container1 = new DataContainer<>(data4_1);
        addElement(container1);

        int ind2 = container1.add(null);
        System.out.println(ind2);

        Integer[] data4_1_3 = {1, null, 3, null, null, null};
        DataContainer<Integer> container2 = new DataContainer<>(data4_1_3);
        addElement(container2);

        Integer[] data4_2_1 = {1, 2, 3};
        DataContainer<Integer> container3 = new DataContainer<>(data4_2_1);
        addElement(container3);

        Integer[] data4_2_2 = {};
        DataContainer<Integer> container4 = new DataContainer<>(data4_2_2);
        addElement(container4);
    }

    public static void addElement(DataContainer<Integer> container) {
        System.out.print("Исходный массив: ");
        soutArray(container);
        int ind1 = container.add(777);
        System.out.println("Индекс добавленного элемента: " + ind1);
        System.out.print("Новый массив: ");
        soutArray(container);
        }

    public static void soutArray(DataContainer<Integer> container) {
        for (int i = 0; i < container.getItems().length; i++) {
            Integer element = container.getItems()[i];
                System.out.print(element + " ");
        }
        System.out.println();
    }


}


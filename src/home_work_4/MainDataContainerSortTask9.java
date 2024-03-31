package home_work_4;

import home_work_4.api.IComparator;
import home_work_4.dto.DataContainer;
import home_work_4.dto.NumberComparator;

public class MainDataContainerSortTask9 {
    public static void main(String[] args) {

        Integer[] data9_1 = {3, 1, 3, 777};

        DataContainer<Integer> container9_1 = new DataContainer<>(data9_1);
        System.out.print("Исходный массив: ");
        soutArray(container9_1);

        IComparator comparatorI = new NumberComparator();
        //DataContainer comparatorNew = new DataContainer(comparatorI);

       // container9_1.sort(new NumberComparator());
        System.out.print("Отсортированный массив: ");
        soutArray(container9_1);
    }

   /* public static void sort(DataContainer<Integer> container, int index) {
        System.out.print("Исходный массив: ");
        soutArray(container);
        container.sort(new NumberComparator());
        System.out.print("Отсортированный массив: ");
        soutArray(container);
        }*/

    public static void soutArray(DataContainer<Integer> container) {
        for (int i = 0; i < container.getItems().length; i++) {
            Integer element = container.getItems()[i];
                System.out.print(element + " ");
        }
        System.out.println();
    }
}


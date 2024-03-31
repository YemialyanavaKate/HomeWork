package home_work_4;

import home_work_4.dto.DataContainer;
import home_work_4.dto.NumberComparator;
import home_work_4.dto.StringLengthComparator;

public class MainDataContainerSortTask9 {
    public static void main(String[] args) {

        Integer[] data9_1 = {3, 1, 3, 777};

        DataContainer<Integer> container9_1 = new DataContainer<>(data9_1);
        System.out.print("Исходный массив: ");
        soutArray(container9_1);

        container9_1.sort(new NumberComparator());
        System.out.print("Отсортированный массив: ");
        soutArray(container9_1);

        String[] data9_2 = {"i", "hello", "1", "Как домашка" };

        DataContainer<String> container9_2 = new DataContainer<>(data9_2);
        System.out.print("Исходный массив: ");
        soutArrayString(container9_2);

        container9_2.sort(new StringLengthComparator());
        System.out.print("Отсортированный массив: ");
        soutArrayString(container9_2);
    }

    public static void soutArray(DataContainer<Integer> container) {
        for (int i = 0; i < container.getItems().length; i++) {
            Integer element = container.getItems()[i];
                System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void soutArrayString(DataContainer<String> container) {
        for (int i = 0; i < container.getItems().length; i++) {
            String element = container.getItems()[i];
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


package home_work_4;

import home_work_4.dto.DataContainer;
import home_work_4.dto.NumberComparator;
import home_work_4.dto.StringLengthComparator;

public class MainDataContainerSortTask11 {
    public static void main(String[] args) {

        System.out.print("Исходный массив: ");
        //soutArray(container9_1);
        //DataContainer.sort(3, 1, 3, 777);

    }

    public static void soutArray(DataContainer<Integer> container) {
        for (int i = 0; i < container.getItems().length; i++) {
            Integer element = container.getItems()[i];
                System.out.print(element + " ");
        }
        System.out.println();
    }

}


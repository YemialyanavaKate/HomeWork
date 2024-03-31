package home_work_4;

import home_work_4.dto.DataContainer;

public class MainDataContainerDeleteTask7 {
    public static void main(String[] args) {

        Integer[] data7_1 = {1, 2, 3, 777};
        System.out.println("Задача 7.1.1: удаляем элемент с индексом 3");
        DataContainer<Integer> container7 = new DataContainer<>(data7_1);
        deleteElementIndex(container7, 3);
        System.out.println("Задача 7.2.1: удаляем элемент с индексом 9");
        DataContainer<Integer> container8 = new DataContainer<>(data7_1);
        deleteElementIndex(container8, 9);
        System.out.println("Задача 7.3.1: удаляем элемент с индексом 2");
        DataContainer<Integer> container9 = new DataContainer<>(data7_1);
        deleteElementIndex(container9, 2);
    }

    public static void deleteElementIndex(DataContainer<Integer> container, int index) {
        System.out.print("Исходный массив: ");
        soutArray(container);
        boolean correct = container.delete(index);
        System.out.println("Получилось удалить данные? " + correct);
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


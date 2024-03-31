package home_work_4;

import home_work_4.dto.DataContainer;

public class MainDataContainerDeleteTask8 {
    public static void main(String[] args) {

        Integer[] data8_1 = {1, 2, 3, 777};
        DataContainer<Integer> container10 = new DataContainer<>(data8_1);
        System.out.print("Задача 8.1.1. Исходный массив: ");
        soutArray(container10);
        boolean correct = container10.delete (null);
        System.out.println("Получилось удалить элемент: null? " + correct);
        System.out.print("Новый массив: ");
        soutArray(container10);

        Integer[] data8_1_2 = {1, 2, 3, 777, null};
        DataContainer<Integer> container11 = new DataContainer<>(data8_1_2);
        System.out.print("Задача 8.1.2. Исходный массив: ");
        soutArray(container11);
        boolean correct8_1_2 = container11.delete (null);
        System.out.println("Получилось удалить элемент: null? " + correct8_1_2);
        System.out.print("Новый массив: ");
        soutArray(container11);

        DataContainer<Integer> container12 = new DataContainer<>(data8_1);
        System.out.print("Задача 8.2.1. Исходный массив: ");
        soutArray(container12);
        Integer a = 777;
        boolean correct8_2_1 = container12.delete(a);
        System.out.println("Получилось удалить элемент: " + a + "? " + correct8_2_1);
        System.out.print("Новый массив: ");
        soutArray(container12);

        DataContainer<Integer> container13 = new DataContainer<>(data8_1);
        System.out.print("Задача 8.3.1. Исходный массив: ");
        soutArray(container13);
        Integer b = 111;
        boolean correct8_3_1 = container13.delete(b);
        System.out.println("Получилось удалить элемент: " + b + "? " + correct8_3_1);
        System.out.print("Новый массив: ");
        soutArray(container13);

        Integer[] data8_4 = {1, 2, 3, 777, 3};
        DataContainer<Integer> container14 = new DataContainer<>(data8_4);
        System.out.print("Задача 8.4.1. Исходный массив: ");
        soutArray(container14);
        Integer c = 3;
        boolean correct8_4 = container14.delete(c);
        System.out.println("Получилось удалить элемент: " + c + "? " + correct8_4);
        System.out.print("Новый массив: ");
        soutArray(container14);
    }

    public static void soutArray(DataContainer<Integer> container) {
        for (int i = 0; i < container.getItems().length; i++) {
            Integer element = container.getItems()[i];
                System.out.print(element + " ");
        }
        System.out.println();
    }
}


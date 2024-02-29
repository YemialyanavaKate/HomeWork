package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;

import static home_work_2.utils.SortsUtils.shake;
import static home_work_2.utils.SortsUtils.sort;

public class SortsMain {
    public static void main(String[] args) {
        main4_2_2_1();
        main4_2_2_2();
        main4_2_2_3();
        main4_2_2_4();
        main4_2_2_5();
        main4_2_3();
        main4_2_4();

    }
    static void main4_2_2_1() {
    int[] array1 = {1, 2, 3, 4, 5, 6};
            System.out.println("Исходный массив содержит элементы: ");
            for (int i : array1) {
        System.out.print(i + " ");
    }
            System.out.println();
    sort(array1);
            System.out.println("Отсортированный массив (пузырьковая сортировка) содержит элементы: ");
            for (int j : array1) {
        System.out.print(j + " ");
    }
            System.out.println();
    shake(array1);
            System.out.println("Отсортированный массив (шейкерная сортировка) содержит элементы: ");
            for (int j : array1) {
        System.out.print(j + " ");
    }
            System.out.println();
}

static void main4_2_2_2() {
    int[] array2 = {1, 1, 1, 1};
    System.out.println("Исходный массив содержит элементы: ");
    for (int i : array2) {
        System.out.print(i + " ");
    }
    System.out.println();
    sort(array2);
    System.out.println("Отсортированный массив (пузырьковая сортировка) содержит элементы: ");
    for (int j : array2) {
        System.out.print(j + " ");
    }
    System.out.println();
    shake(array2);
    System.out.println("Отсортированный массив (шейкерная сортировка) содержит элементы: ");
    for (int j : array2) {
        System.out.print(j + " ");
    }
    System.out.println();
}

static void main4_2_2_3 () {
    int[] array3 = {9, 1, 5, 99, 9, 9};
    System.out.println("Исходный массив содержит элементы: ");
    for (int i : array3) {
        System.out.print(i + " ");
    }
    System.out.println();
    sort(array3);
    System.out.println("Отсортированный массив (пузырьковая сортировка) содержит элементы: ");
    for (int j : array3) {
        System.out.print(j + " ");
    }
    System.out.println();
    shake(array3);
    System.out.println("Отсортированный массив (шейкерная сортировка) содержит элементы: ");
    for (int j : array3) {
        System.out.print(j + " ");
    }
    System.out.println();
}

static void main4_2_2_4 () {
    int[] array4 = {};
    System.out.println("Исходный массив содержит элементы: ");
    for (int i : array4) {
        System.out.print(i + " ");
    }
    System.out.println();
    sort(array4);
    System.out.println("Отсортированный массив (пузырьковая сортировка) содержит элементы: ");
    for (int j : array4) {
        System.out.print(j + " ");
    }
    System.out.println();
    shake(array4);
    System.out.println("Отсортированный массив (шейкерная сортировка) содержит элементы: ");
    for (int j : array4) {
        System.out.print(j + " ");
    }
    System.out.println();
}


    static void main4_2_2_5 () {
        int[] array5 = {6, 5, 4, 3, 2, 1};
        System.out.println("Исходный массив содержит элементы: ");
        for (int i : array5) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(array5);
        System.out.println("Отсортированный массив (пузырьковая сортировка) содержит элементы: ");
        for (int j : array5) {
            System.out.print(j + " ");
        }
        System.out.println();
        shake(array5);
        System.out.println("Отсортированный массив (шейкерная сортировка) содержит элементы: ");
        for (int j : array5) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void main4_2_3 () {
        int[] array6 = ArraysUtils.arrayRandome(10, 100);
        System.out.println("Исходный массив содержит элементы: ");
        for (int i : array6) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(array6);
        System.out.println("Отсортированный массив (пузырьковая сортировка) содержит элементы: ");
        for (int j : array6) {
            System.out.print(j + " ");
        }
        System.out.println();
        shake(array6);
        System.out.println("Отсортированный массив (шейкерная сортировка) содержит элементы: ");
        for (int j : array6) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void main4_2_4 () {
        int[] array7 = ArraysUtils.arrayFromConsole();
        System.out.println("Исходный массив содержит элементы: ");
        for (int i : array7) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(array7);
        System.out.println("Отсортированный массив (пузырьковая сортировка) содержит элементы: ");
        for (int j : array7) {
            System.out.print(j + " ");
        }
        System.out.println();
        shake(array7);
        System.out.println("Отсортированный массив (шейкерная сортировка) содержит элементы: ");
        for (int j : array7) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}


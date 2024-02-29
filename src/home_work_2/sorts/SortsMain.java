package home_work_2.sorts;

import static home_work_2.utils.SortsUtils.sort;

public class SortsMain {
    public static void main(String[] args) {
        int[] array3 = {9,1,5,99,9,9};
        System.out.println("Исходный массив содержит элементы: ");
        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(array3);
        System.out.println("Отсортированный массив содержит элементы: ");
        for (int j : array3) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

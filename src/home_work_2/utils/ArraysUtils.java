package home_work_2.utils;

import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size = console.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элемент массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }

        System.out.println();
        return array;
    }

        public static int[] arrayRandome(int size, int maxValueExclusion) {
            int[] array = new int[size];
            int c = 0;
            for (int i = 0; i < size; i++) {
                array[i] = c + (int) (Math.random() * maxValueExclusion);
            }
            System.out.println();
            return array;
    }
}

package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Main2_4_3metod {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandome(10, 10);

        double avrg = arithmeticalMean(container);
        System.out.printf("Среднее арифметическое массива:%.2f\n ",avrg);
        System.out.print("Элементы массива, которые меньше среднего арифметческого:");
        String massage = underMean(container, avrg);
        System.out.println(massage);
    }


     public static double arithmeticalMean(int[] container) {
        int sum = 0;
        double avrg;
         for (int element : container) {
             sum = sum + element;
         }
        avrg = sum * 1.0/ container.length;
        return avrg;
    }
    public static String underMean (int[] container, double avrg) {
        String massage = "";
        for (int element : container) {
            if (element < avrg) {
                massage += element + " ";
            }
        }
        return massage;
    }

}


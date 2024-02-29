package home_work_2.arrays;

import java.util.Scanner;

public class Main2_4 {
    public static void main(String[] args) {


        main2_4_1();
        main2_4_2();
        main2_4_3();
        main2_4_4();
        main2_4_5();
        main2_4_6();
    }

    static void main2_4_1() {
        int[] container = ArraysUtils.arrayRandome(50, 100);
        int sumEwen = 0;

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (element >= 0 && element % 2 == 0) {

                sumEwen = sumEwen + element;
            }
        }
        System.out.println("Сумма четных положительных элементов массива " + sumEwen);
    }

    static void main2_4_2() {
        int[] container = ArraysUtils.arrayRandome(50, 100);
        int max = 0;
        int index = 0;

        for (int i = 0; i < container.length; i = i+2) {
            int element = container[i];
            if (element > max) {
                max = element;
                index = i;
            }
        }
        System.out.println("ИНДЕКС максимального из элементов массива с четными индексами " + index);
        System.out.println("ВЕЛИЧИНА максимального из элементов массива с четными индексами " + max);
    }

    static void main2_4_3() {
        int[] container = ArraysUtils.arrayRandome(50, 100);
        int sum = 0;
        double avrg;

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            sum = sum + element;
            }
        avrg = sum * 1.0/ container.length;
        System.out.printf("Среднее арифметическое массива:%.2f\n ",avrg);
        System.out.print("Элементы массива, которые меньше среднего арифметческого:");

            for (int i = 0; i < container.length; i++) {
                int element = container[i];
                if (element < avrg) {
                    System.out.print(element + " ");
                }
            }
        System.out.println();
    }

    static void main2_4_4() {
        int[] container = ArraysUtils.arrayRandome(50, 100);

        System.out.println("Массив содержит элементы: ");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }

            int min1 = 0;
            int i;
            int min2;

            for (i = 0; i < container.length; i++) {
                if (container[i] < container[min1]) {
                    min1 = i;
                }
            }
            if (min1 == 0) {
                min2 = 1;
            } else {
                min2 = 0;
            }

            for (i = 0; i < container.length; i++) {
                if (i != min1) {
                    if (container[i] < container[min2]) {
                        min2 = i;
                    }
                }
            }
        System.out.println("Минимумы: " + container[min1] + " и " + container[min2]);
    }

    static void main2_4_5() {
        int[] container = ArraysUtils.arrayRandome(50, 100);

        System.out.println("Массив содержит элементы: ");
        for (int i = 0; i < container.length; i++) {
          System.out.print(container[i] + " ");
        }

        Scanner console = new Scanner(System.in);
        System.out.println("Введите границы удаляемого диапазона: от ");
        int l1 = console.nextInt();
        System.out.println("Введите границы удаляемого диапазона: до ");
        int l2 = console.nextInt();
        int j;
        //int k = 0;
        int i = 0;
        int m = container.length;
        while (i < m) {
            if (container[i] >= l1 && container[i] <= l2) {
                m -= 1;
                for (j = i; j < m; j++) {
                    container[j] = container[j + 1];
                }
            } else {
                i += 1;
            }
        }
        for (i = m; i < container.length; i++) {
            container[i] = 0;
        }
        System.out.println("Откорректированный массив содержит элементы: ");
                for (i = 0; i < container.length; i++) {
                    System.out.print(container[i] + " ");
                    }
        System.out.println();
    }
    static void main2_4_6() {
        int[] container = ArraysUtils.arrayRandome(50, 100);
        int sumNumber = 0;

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            while (element > 0) {
                sumNumber = sumNumber + element % 10;
                element = element / 10;
            }
        }
        System.out.println("Сумма цифр массива " + sumNumber);
    }
}


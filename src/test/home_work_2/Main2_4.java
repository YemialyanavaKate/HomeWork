package test.home_work_2;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Main2_4 {

    static int main2_4_1(int[] container) {
        int sumEwen = 0;

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (element >= 0 && element % 2 == 0) {

                sumEwen = sumEwen + element;
            }
        }
        System.out.println("Сумма четных положительных элементов массива " + sumEwen);
        return sumEwen;
    }

    static int main2_4_2(int[] container) {
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
        return max;
    }

    static String main2_4_3(int[] container) {
        int sum = 0;
        double avrg;
        String  message = "";

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            sum = sum + element;
        }
        avrg = sum * 1.0/ container.length;
        System.out.printf("Среднее арифметическое массива:%.2f\n ",avrg);

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (element < avrg) {
                message = message + element + " ";
            }
        }
        System.out.print("Элементы массива, которые меньше среднего арифметческого:" + message);
        return message;
    }

    static String main2_4_4(int[] container) {
        String  message = "";
        int min1 = 0;
        int i;
        int min2;

        if (container.length == 1){
            return message = message + container[0];
        }

        if (container.length == 2){
            return message = message + container[0] + " " + container[1];
        }
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
        message = message + container[min1] + " " + container[min2];
        return message;
    }

    static String main2_4_5(int[] container, int l1, int l2) {

        String  message = "";
        int j;
        int i = 0;
        int m;
        while (i <= container.length) {
            if (i >= l1 && i <= l2) {
                for (j = l1; j < container.length -1; j++) {
                    container[j] = container[j + 1];
                } i++;
            } else {
                i += 1;
            }
        }
        /*for (i = m; i < container.length; i++) {
            container[i] = 0;
        }*/
        m = container.length - ((l2 - l1) + 1);
        for (i = 0; i < m; i++) {
            message = message + container[i] + " ";
        }
        return message;
    }
    static  int main2_4_6(int[] container) {
        int sumNumber = 0;

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            while (element > 0) {
                sumNumber = sumNumber + element % 10;
                element = element / 10;
            }
        }
        System.out.println("Сумма цифр массива " + sumNumber);
        return sumNumber;
    }
}


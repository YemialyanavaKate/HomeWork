package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Main2_4_1metod {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayRandome(50, 100);

        int sumEwen = sumEwen(container);
        System.out.println("Сумма четных положительных элементов массива " + sumEwen);
    }

    public static int sumEwen (int[] container){
        int sumEwen = 0;

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (element >= 0 && element % 2 == 0) {

                sumEwen = sumEwen + element;
            }
        }
        return sumEwen;
    }

}


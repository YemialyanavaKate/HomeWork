package test.home_work_2;

import java.util.Scanner;

public class Main1_1_1 {

   public static final int MIN_NUMERIC_FOR_INPUT = 1;

    public static int factorial(int number) {
        boolean checkInput;
        int i = 1;
        int f = 1;

        if (number == 1){
            f = 1;
            System.out.println("Факториал числа 1 равен 1");
        } else {
            checkInput = number < MIN_NUMERIC_FOR_INPUT;
            if (checkInput) {
                System.out.println("Ошибка, введите значение от 1 и выше");
            }
            if (!checkInput) {
                while (i < number) {
                    f = f * i;
                    System.out.print(i + "*");
                    i++;
                }
                f = f * i;
                System.out.println(number + "=" + f);
            }
        }return f;
    }
}
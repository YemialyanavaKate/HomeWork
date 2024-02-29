package home_work_2.loops;

import java.util.Scanner;

public class Main1_1_1 {

    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean checkInput;
        int i = 1;
        int f = 1;

        System.out.println("Введите целое положительное число:");
        int number = Integer.parseInt(console.nextLine());
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
    }
}
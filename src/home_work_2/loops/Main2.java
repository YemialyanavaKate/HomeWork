package home_work_2.loops;

import java.util.Scanner;

public class Main2 {

    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean checkInput;

        System.out.println("Введите целое положительное число:");
        int number = Integer.parseInt(console.nextLine());
        checkInput = number < MIN_NUMERIC_FOR_INPUT;
        if (checkInput) {
            System.out.println("Ошибка, введите значение от 1 и выше");
        }
        int a = 1;
        int f = 1;

        while (number > 0) {
            a = number%10;
            number = number/10;
            System.out.print(a + "*");
            f = a * f;
        }

        //System.out.println(number + "=" + f);
        System.out.println("=" + f);
    }
}

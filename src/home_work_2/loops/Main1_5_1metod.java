package home_work_2.loops;

import java.util.Scanner;

public class Main1_5_1metod {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число a=");
        int a = console.nextInt();

        int m = maxDigit(a);

        System.out.println("Наибольшая цифра введенного числа = " + m);
    }
    public static int maxDigit (int a) {
        int m = a % 10;
        a = a / 10;

        while (a > 0) {
            if (a % 10 > m) {
                m = a % 10;
            }
            a = a / 10;
        }
        return m;
    }
}


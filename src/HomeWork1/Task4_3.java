package HomeWork1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое значение №1 больше 0");
        int a = console.nextInt();
        System.out.println("Введите целое значение №2 больше 0");
        int b = console.nextInt();

        long c = a / b;
        String result = "Результат проверки деления числа №1 на число №2:";
        if (a % b == 0) {
            System.out.println(result + "делится без остатка");
        } else {
            System.out.println(result + "не делится без остатка");
            System.out.println("Остаток:" + a % b);
                }

        System.out.println("Частное:" + c);

    }
}

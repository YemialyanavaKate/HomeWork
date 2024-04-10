package test.home_work_1;

import java.util.Scanner;

public class Task4_3New {
    public String delenie (int a, int b) {

        String text;
        String result = "Результат проверки деления числа №1 на число №2:";
        if (a % b == 0) {
            System.out.println(result + "делится без остатка");
            return text = "делится";
        } else {
            System.out.println(result + "не делится без остатка");
            System.out.println("Остаток:" + a % b);
            return text = "не делится";
                }
    }
}

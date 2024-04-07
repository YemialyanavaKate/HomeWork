package test.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_3Test {

    @DisplayName("Task4_3 - Первое больше второго и первое делится на второе")
    @Test
    public void TestFirstMoreSecondAndDivided() {
        int a = 10;
        int b = 5;
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
    @DisplayName("Task4_3 - Первое больше второго и первое неделится на второе")
    @Test
    public void TestFirstMoreSecondAndNotDivided() {
        int a = 17;
        int b = 5;
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

    @DisplayName("Task4_3 - Первое меньше второго")
    @Test
    public void TestFirstLessSecond() {
        int a = 7;
        int b = 11;
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

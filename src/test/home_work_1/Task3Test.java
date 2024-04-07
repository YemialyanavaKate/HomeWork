package test.home_work_1;

import home_work_1.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Task3Test {

    @DisplayName("Task3 - Положительное число (Maht)")
    @Test
    public void TestMathPositive() {
        int aModul = Math.abs(4);
        double aSqure = Math.pow(4, 2);

        System.out.println("Модуль числа 'a' " + aModul);
        System.out.println("Квадрат числа 'a' " + aSqure);
        Assertions.assertEquals(aModul, 4);
        Assertions.assertEquals(aSqure, 16);
    }
    @DisplayName("Task3 - Отрицательное число (Maht)")
    @Test
    public void TestMathNegative() {
        int aModul = Math.abs(-5);
        double aSqure = Math.pow(-5, 2);

        System.out.println("Модуль числа 'a' " + aModul);
        System.out.println("Квадрат числа 'a' " + aSqure);
        Assertions.assertEquals(aModul, 5);
        Assertions.assertEquals(aSqure, 25);
    }
    @DisplayName("Task3 - Null (Maht)")
    @Test
    public void TestMathNull() {
        int aModul = Math.abs(0);
        double aSqure = Math.pow(0, 2);

        System.out.println("Модуль числа 'a' " + aModul);
        System.out.println("Квадрат числа 'a' " + aSqure);
        Assertions.assertEquals(aModul, 0);
        Assertions.assertEquals(aSqure, 0);
    }


}

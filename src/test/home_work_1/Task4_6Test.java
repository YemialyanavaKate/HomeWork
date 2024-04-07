package test.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_6Test {

    @DisplayName("Task4_6 - Вводим високосный год (не столетие)")
    @Test
    public void TestLeapYear() {
        int a = 2024;

        if (a % 4 != 0) {
            System.out.println("Это не високосный год");
        } else if (a % 100 != 0) {
            System.out.println("Это високосный год ");
        } else if (a % 400 == 0) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }

    @DisplayName("Task4_6 - Вводим високосный год (столетие)")
    @Test
    public void TestLeapYearСentury() {
        int a = 2000;

        if (a % 4 != 0) {
            System.out.println("Это не високосный год");
        } else if (a % 100 != 0) {
            System.out.println("Это високосный год ");
        } else if (a % 400 == 0) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }

    @DisplayName("Task4_6 - Вводим невисокосный год (столетие)")
    @Test
    public void TestAnotherYearСentury() {
        int a = 300;

        if (a % 4 != 0) {
            System.out.println("Это не високосный год");
        } else if (a % 100 != 0) {
            System.out.println("Это високосный год ");
        } else if (a % 400 == 0) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }

    @DisplayName("Task4_6 - Вводим невисокосный год")
    @Test
    public void TestAnotherYear() {
        int a = 2025;

        if (a % 4 != 0) {
            System.out.println("Это не високосный год");
        } else if (a % 100 != 0) {
            System.out.println("Это високосный год ");
        } else if (a % 400 == 0) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }
}

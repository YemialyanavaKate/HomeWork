package test.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_1Test {

    @DisplayName("Task4_1 - Генерация двух четных чисел")
    @Test
    public void TestTwoPositive() {
        int a = 10;
        int b = 12;
        if (a % 2 == 0 && b % 2 == 0) {
            int z = a + 1;
            System.out.println("Случайное число №1 НЕЧEТНОЕ:" + z);
        } else if (a % 2 == 1 && b % 2 == 1){
            int z = a + 1;
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        } else if (a % 2 == 1){
            System.out.println("Случайное число №1 НЕЧЕТНОЕ:" + a);
        } else {
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        }
    }
    @DisplayName("Task4_1 - Генерация двух нечетных чисел")
    @Test
    public void TestTwoNegative() {
        int a = 11;
        int b = 13;
        if (a % 2 == 0 && b % 2 == 0) {
            int z = a + 1;
            System.out.println("Случайное число №1 НЕЧEТНОЕ:" + z);
        } else if (a % 2 == 1 && b % 2 == 1){
            int z = a + 1;
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        } else if (a % 2 == 1){
            System.out.println("Случайное число №1 НЕЧЕТНОЕ:" + a);
        } else {
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        }
    }
    @DisplayName("Task4_1 - Генерация null и четного")
    @Test
    public void TestNullPositive() {
        int a = 0;
        int b = 12;
        if (a % 2 == 0 && b % 2 == 0) {
            int z = a + 1;
            System.out.println("Случайное число №1 НЕЧEТНОЕ:" + z);
        } else if (a % 2 == 1 && b % 2 == 1){
            int z = a + 1;
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        } else if (a % 2 == 1){
            System.out.println("Случайное число №1 НЕЧЕТНОЕ:" + a);
        } else {
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        }
    }
    @DisplayName("Task4_1 - Генерация нечетного и null")
    @Test
    public void TestNegativeNull() {
        int a = 13;
        int b = 0;
        if (a % 2 == 0 && b % 2 == 0) {
            int z = a + 1;
            System.out.println("Случайное число №1 НЕЧEТНОЕ:" + z);
        } else if (a % 2 == 1 && b % 2 == 1){
            int z = a + 1;
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        } else if (a % 2 == 1){
            System.out.println("Случайное число №1 НЕЧЕТНОЕ:" + a);
        } else {
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        }
    }
    @DisplayName("Task4_1 - Генерация двух null")
    @Test
    public void TestNull() {
        int a = 0;
        int b = 0;
        if (a % 2 == 0 && b % 2 == 0) {
            int z = a + 1;
            System.out.println("Случайное число №1 НЕЧEТНОЕ:" + z);
        } else if (a % 2 == 1 && b % 2 == 1){
            int z = a + 1;
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        } else if (a % 2 == 1){
            System.out.println("Случайное число №1 НЕЧЕТНОЕ:" + a);
        } else {
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + b);
        }
    }
}

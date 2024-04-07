package test.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_2Test {

    @DisplayName("Task4_2 - Три числа в порядке возрастания")
    @Test
    public void TestIncrease() {
        int a = 10;
        int b = 12;
        int c = 13;
        String result = "Среднее значение из трех чисел:";
        if (a < b  && b < c || c < b && b < a) {
            System.out.println(result + b);
        } else if (b < a && a < c || c < a && a < b) {
            System.out.println(result + a);
        } else {
            System.out.println(result + c);
        }
    }

    @DisplayName("Task4_2 - Три числа в порядке убывания")
    @Test
    public void TestDecrease() {
        int a = 15;
        int b = 7;
        int c = 2;
        String result = "Среднее значение из трех чисел:";
        if (a < b  && b < c || c < b && b < a) {
            System.out.println(result + b);
        } else if (b < a && a < c || c < a && a < b) {
            System.out.println(result + a);
        } else {
            System.out.println(result + c);
        }
    }
    @DisplayName("Task4_2 - Среднее на первом месте")
    @Test
    public void TestFirstNumber() {
        int a = 12;
        int b = 10;
        int c = 13;
        String result = "Среднее значение из трех чисел:";
        if (a < b  && b < c || c < b && b < a) {
            System.out.println(result + b);
        } else if (b < a && a < c || c < a && a < b) {
            System.out.println(result + a);
        } else {
            System.out.println(result + c);
        }
    }

    @DisplayName("Task4_2 - Среднее на последнем месте")
    @Test
    public void TestLastestNumber() {
        int a = 9;
        int b = 15;
        int c = 13;
        String result = "Среднее значение из трех чисел:";
        if (a < b  && b < c || c < b && b < a) {
            System.out.println(result + b);
        } else if (b < a && a < c || c < a && a < b) {
            System.out.println(result + a);
        } else {
            System.out.println(result + c);
        }
    }

}

package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_1_1_Test {
    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    @DisplayName("Факториал положительного числа")
    @Test
    public void testFactorial(){

        boolean checkInput;
        int i = 1;
        int f = 1;

        int number = 5;
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
        Assertions.assertEquals(120, f);
    }

    @DisplayName("Факториал отрицательного")
    @Test
    public void testFactorialNegative(){

        boolean checkInput;
        int i = 1;
        int f = 1;

        int number = -10;
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

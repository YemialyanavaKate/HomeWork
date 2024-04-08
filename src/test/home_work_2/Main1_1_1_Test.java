package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_1_1_Test {
    //public static final int MIN_NUMERIC_FOR_INPUT = 1;

    @DisplayName("Факториал числа 5")
    @Test
    public void testFactorialFive(){
        Assertions.assertEquals(120, Main1_1_1.factorial(5));
    }

    @DisplayName("Факториал числа 1")
    @Test
    public void testFactorialOne(){
        Assertions.assertEquals(1, Main1_1_1.factorial(1));
    }

    @DisplayName("Факториал числа 6")
    @Test
    public void testFactorialSix(){
        Assertions.assertEquals(720, Main1_1_1.factorial(6));
    }
}

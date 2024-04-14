package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_1_2_Test {
    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    @DisplayName("Рекурсия числа 5")
    @Test
    public void testRecursion5(){
        Assertions.assertEquals(120, Main1_1_2.recursion(5));
        Main1_1_2.print(5);
    }

    @DisplayName("Рекурсия числа 1")
    @Test
    public void testRecursion1(){
        Assertions.assertEquals(1, Main1_1_2.recursion(1));
        Main1_1_2.print(1);
    }
    @DisplayName("Рекурсия числа 6")
    @Test
    public void testRecursion6(){
        Assertions.assertEquals(720, Main1_1_2.recursion(6));
        Main1_1_2.print(6);
    }

}

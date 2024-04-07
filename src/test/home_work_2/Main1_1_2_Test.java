package test.home_work_2;

import home_work_2.loops.Main1_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_1_2_Test {
    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    @DisplayName("Рекурсия положительного числа")
    @Test
    public void testRecursion(){
        int a = Main1_1_2.recursion(5);

        Assertions.assertEquals(a, 120);
    }

    @DisplayName("Рекурсия 1")
    @Test
    public void testRecursion1(){
        int a = Main1_1_2.recursion(1);

        Assertions.assertEquals(a, 1);
    }

}

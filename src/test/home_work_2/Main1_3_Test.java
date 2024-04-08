package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_3_Test {
    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    @DisplayName("Для возводимого 18.0 и степени 5")
    @Test
    public void testOne(){

        Assertions.assertEquals(1_889_568, Main1_3.pow(18.0, 5));
    }

    @DisplayName("Для возводимого 7.5 и степени 2")
    @Test
    public void testTwo(){

        Assertions.assertEquals(56.25, Main1_3.pow(7.5,2));
    }
    }


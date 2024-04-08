package test.home_work_2;

import home_work_2.loops.Main1_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_2_Test {
    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    @DisplayName("Целое положительное число 181232375")
    @Test
    public void testPositiv(){

        Assertions.assertEquals(10080, Main1_2.multy(181232375));
    }

    @DisplayName("Целое положительное число 56432")
    @Test
    public void testPositiv56432(){

        Assertions.assertEquals(720, Main1_2.multy(56432));
    }
    }


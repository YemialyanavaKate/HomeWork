package test.home_work_1;

import home_work_1.Task2;
import hw.DataContainerString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task2Test {
    @DisplayName("Операторы")
    @Test
    public void TestOperators() {
        int k = 8;
        int a1 = 5 + 2 / k;

        int a2 = (5 + 2) / k;

        int m = 2;
        int a3 = (5 + m++) / k;

        m = 2;
        int a4 = (5 + m++) / --k;

        m = 2;
        k = 8;
        int a5 = (5 * 2 >> m++) / --k;

        m = 2;
        k = 8;
        int a6 = (5 + 7 > 20 ? 68 : 22 * 2 >> m++) / --k;

        m = 8;
        k = 2;
        // int a7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> t3++) / --k3; // оператор '/' не можeт быть применен, т.к. значение в скобках может быть типа boolean

        boolean a8 = 6 - 2 > 3 && 12 * 12 <= 119;
        boolean a9 = true && false;

        Assertions.assertEquals(a1, 5);
        Assertions.assertEquals(a2, 0);
        Assertions.assertEquals(a3, 0);
        Assertions.assertEquals(a4, 1);
        Assertions.assertEquals(a5, 0);
        Assertions.assertEquals(a6, 1);
        Assertions.assertFalse(a8);
        Assertions.assertFalse(a9);

    }

}

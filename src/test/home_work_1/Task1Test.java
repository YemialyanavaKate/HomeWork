package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @DisplayName("Совпадение ответов побитовых операций")
    @Test
    public void TestOperators() {
        float x = 42.5f; // побитовые операторы могут быть примерены только к целочисленным типам
        int y = 16; // 00010000
        int z = (int) x; // выполним преобразование типов, чтобы иметь возможность применить побитовую операцию

        int resultAnd = z & y; // 00000000
        int resultOr = z | y; //00111010
        Assertions.assertEquals(resultAnd, 0);
        Assertions.assertEquals(resultOr, 58);
    }

}

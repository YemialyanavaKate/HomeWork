package test.home_work_3;

import hw.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathCopyTest {
    @DisplayName("Добавление не NULL в контейнер")
    @Test
    public void testAddNotNull(){
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        double var1 = calc.divide(28, 5); //5.60
        double var2 = calc.pow(var1, 2); //31.36
        double var3 = calc.multiply(15, 7); //105.00
        double var4 = calc.add(var2, var3); //136.36
        double result = calc.add(var4, 4.1); //140.45999999999998

        Assertions.assertEquals(140.45999999999998, result);
    }
}

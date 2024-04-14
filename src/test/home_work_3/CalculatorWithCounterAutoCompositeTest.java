package test.home_work_3;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoCompositeTest {
    @DisplayName("Тестирование задачи из примера")
    @Test
    public void testTask1(){
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double var1 = calc.divide(28, 5); //5.60
        double var2 = calc.mathPow(var1, 2); //31.36
        double var3 = calc.multiply(15, 7); //105.00
        double var4 = calc.add(var2, var3); //136.36
        double result = calc.add(var4, 4.1); //140.45999999999998

        Assertions.assertEquals(140.45999999999998, result);
    }

    @DisplayName("Тестирование задачи: (5 - 2) * 8 / 4")
    @Test
    public void testTask2(){
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double result =  calc.divide(calc.multiply(calc.subtract(5,2), 8),4);
        Assertions.assertEquals(6.0, result);
    }
}

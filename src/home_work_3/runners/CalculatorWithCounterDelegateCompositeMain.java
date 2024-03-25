package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
//4.1 + 15 * 7 +  (28 / 5.0) * (28/5.0)

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {

       CalculatorWithCounterAutoComposite calc6new = new CalculatorWithCounterAutoComposite();

       double var1 = calc6new.divide(28, 5); //5,6
       double var2 = calc6new.mathPow(var1, 2); //31,36
       double var3 = calc6new.multiply(15, 7); //105,00
       double var4 = calc6new.add(var2, var3); //136,36
       double result = calc6new.add(var4, 4.1); //140,46

       long i = calc6new.getCountOperation();

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);
        System.out.println("Kоличество использований калькулятора " + i);
    }
}

package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation cacl8New = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calc9New = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calc10New = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        double var1 = cacl8New.divide(28, 5);
        double var2 = cacl8New.pow(var1, 2);
        double var3 = cacl8New.multiply(15, 7);
        double var4 = cacl8New.add(var2, var3);
        double result = cacl8New.add(var4, 4.1);

        long i = cacl8New.getI();

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("Расчет с CalculatorWithOperator = %.2f\n", result);
        System.out.println("Kоличество использований калькулятора " + i);

        double var10 = calc9New.divide(28, 5);
        double var20 = calc9New.pow(var10, 2);
        double var30 = calc9New.multiply(15, 7);
        double var40 = calc9New.add(var20, var30);
        double result2 = calc9New.add(var40, 4.1);

        long i2 = calc9New.getI();

        System.out.printf("%.2f\n", var10);
        System.out.printf("%.2f\n", var20);
        System.out.printf("%.2f\n", var30);
        System.out.printf("%.2f\n", var40);
        System.out.printf("Расчет с CalculatorWithMathCopy = %.2f\n", result2);
        System.out.println("Kоличество использований калькулятора " + i2);

        double var100 = calc9New.divide(28, 5);
        double var200 = calc9New.pow(var100, 2);
        double var300 = calc9New.multiply(15, 7);
        double var400 = calc9New.add(var200, var300);
        double result3 = calc9New.add(var400, 4.1);

        long i3 = calc10New.getI();

        System.out.printf("%.2f\n", var100);
        System.out.printf("%.2f\n", var200);
        System.out.printf("%.2f\n", var300);
        System.out.printf("%.2f\n", var400);
        System.out.printf("Расчет с CalculatorWithMathExtends = %.2f\n", result3);
        System.out.println("Kоличество использований калькулятора " + i3);

    }
}

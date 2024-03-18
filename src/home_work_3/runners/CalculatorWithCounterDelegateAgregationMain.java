package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation calc7New = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());

        double var1 = calc7New.divide(28, 5); //5,6
        double var2 = calc7New.pow(var1, 2); //31,36
        double var3 = calc7New.multiply(15, 7); //105,00
        double var4 = calc7New.add(var2, var3); //136,36
        double result = calc7New.add(var4, 4.1); //140,46

        long i = calc7New.getI();

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);
        System.out.println("Kоличество использований калькулятора " + i);
    }
}

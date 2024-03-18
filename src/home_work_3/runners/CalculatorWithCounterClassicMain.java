package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
//класс с калькулятором и счетчиком математических операций, который вызывает программист
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc4 = new CalculatorWithCounterClassic();

        double var1 = calc4.divide(28, 5); //5,6
        calc4.incrementCountOperetion();
        double var2 = calc4.pow(var1,2); //31,36
        calc4.incrementCountOperetion();
        double var3 = calc4.multiply(15, 7); //105,00
        calc4.incrementCountOperetion();
        double var4 = calc4.add(var2, var3); //136,36
        calc4.incrementCountOperetion();
        double result = calc4.add(var4, 4.1); //140,46
        calc4.incrementCountOperetion();

        long j = calc4.getCountOperation();

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);
        System.out.println("Kоличество использований калькулятора " + j);

    }
}

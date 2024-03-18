package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
//4.1 + 15 * 7 +  (28 / 5.0) * (28 / 5.0)
//класс с калькулятором, который использует простые арифметические операции и вызов библиотеки Math
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator002 = new CalculatorWithMathCopy();

        double var1 = calculator002.divide(28, 5); //5.60
        double var2 = calculator002.pow(var1, 2); //31.36
        double var3 = calculator002.multiply(15, 7); //105.00
        double var4 = calculator002.add(var2, var3); //136.36
        double result = calculator002.add(var4, 4.1); //140.46

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);
    }
}

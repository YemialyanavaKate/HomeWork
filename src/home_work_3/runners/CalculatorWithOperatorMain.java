package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;
//класс с калькулятором который использует простые арифметические операции
public class CalculatorWithOperatorMain {
    //4.1 + 15 * 7 +  (28 / 5.0) * (28/5.0)
    public static void main(String[] args) {

        CalculatorWithOperator calculator001 = new CalculatorWithOperator();

        double var1 = calculator001.divide(28, 5); //5.60
        double var2 = calculator001.pow(var1, 2); //31.36
        double var3 = calculator001.multiply(15, 7); //105.00
        double var4 = calculator001.add(var2, var3); //136.36
        double result = calculator001.add(var4, 4.1); //140.46

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);
    }
}

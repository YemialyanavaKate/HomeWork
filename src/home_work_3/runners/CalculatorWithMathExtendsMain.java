package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
//4.1 + 15 * 7 +  (28 / 5.0) * (28/5.0)
// класс с калькулятором, который переопределяет 3 метода родительского класса CalculatorWithOperator
public class CalculatorWithMathExtendsMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends calculator003 = new CalculatorWithMathExtends();

        double var1 = calculator003.divide(28, 5); //5.60
        double var2 = calculator003.pow(var1, 2); //31.36
        double var3 = calculator003.multiply(15, 7); //105.00
        double var4 = calculator003.add(var2, var3); //136.36
        double result = calculator003.add(var4, 4.1); //140.46

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);

    }
}

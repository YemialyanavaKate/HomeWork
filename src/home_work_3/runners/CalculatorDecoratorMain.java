package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {

        CalculatorWithMemoryDecorator calc0 = new  CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        ICalculator calc = new CalculatorWithCounterAutoDecorator(calc0);

        double var1 = calc.divide(28, 5); //5,60
        double var2 = calc.pow(var1, 2); //31,36
        double var3 = calc.multiply(15, 7); //105,00
        double var4 = calc.add(var2, var3); //136,36
        double result = calc.add(var4, 4.1); //140,46
        System.out.printf("%.2f%n", result); // 140.46

        //long i = calc.getI();
    }
}

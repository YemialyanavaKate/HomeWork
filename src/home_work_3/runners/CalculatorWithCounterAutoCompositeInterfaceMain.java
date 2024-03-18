package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calc11New = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        /*CalculatorWithCounterAutoAgregationInterface calc12New = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calc13New = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        ICalculator[] = new ICalculator[3]; */

        double var1 = calc11New.divide(28, 5); //5,60
        double var2 = calc11New.pow(var1, 2); //31,36
        double var3 = calc11New.multiply(15, 7); //105,00
        double var4 = calc11New.add(var2, var3); //136,36
        double result = calc11New.add(var4, 4.1); //140,46

        long i = calc11New.getI();


        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);
        System.out.println("Kоличество использований калькулятора " + i);
        }
    }

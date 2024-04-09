package test.home_work_3;

import home_work_3.calcs.api.ICalculator;

//класс с простыми арифметическими операторами и с вызовом библиотеки Math
public class CalculatorWithMathCopy implements ICalculator {
    private double a;
    private double b;
    private double result;

    public double divide(double a, double b) {
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double pow(double a, int b) {
        if (a >= 0) {
            result =  Math.pow(a, b);
        }
        return result;
    }
        public double module(double a) {
        return Math.abs(a);
        }
        public double sqrt(double a){
        return Math.sqrt(a);
        }
}

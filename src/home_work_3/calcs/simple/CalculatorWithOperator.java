package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
//класс с простыми арифметическими операторами
public class CalculatorWithOperator implements ICalculator {
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
            double result = 1;
            for (int i = 1; i <= b; i++) {
                result = a * result;
            }
            return result;
        }
        return result = result;
    }

    public double module(double a) {
        if (a <= 0) {
            return 0.0 - a;
        }
        return a;
    }

    public double sqrt(double a) {
        double result = 0;
        for (int i = 1; i < a; i++) {
            if (a / i == i) {
                result = i;
                break;
            }
        }
        return result;

    }
}

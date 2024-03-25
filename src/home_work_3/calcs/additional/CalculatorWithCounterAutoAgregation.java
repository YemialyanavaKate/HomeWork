package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithMathCopy calc7;
    public CalculatorWithCounterAutoAgregation (CalculatorWithMathCopy someCalculatorWithMathCopy) {
        this.calc7 = someCalculatorWithMathCopy;
    }
    private int i = 0;

    public double divide(double a, double b) {
        i++;
        return calc7.divide(a, b);
    }
    public double multiply(double a, double b) {
        i++;
        return calc7.multiply(a, b);
    }
    public int subtract (int a, int b) {
        i++;
        return calc7.subtract(a, b);
    }
    public double add (double a, double b) {
        i++;
        return calc7.add(a, b);
    }
    public double pow (double a, int b) {
        i++;
        return calc7.pow(a, b);
    }
     public double module (double a) {
        i++;
        return calc7.module(a);
     }
     public double sqrt (int a) {
        i++;
        return calc7.sqrt(a);
     }
    long getCountOperation() {
        return i;
    }

    public int getI() {
        return i;
    }
}

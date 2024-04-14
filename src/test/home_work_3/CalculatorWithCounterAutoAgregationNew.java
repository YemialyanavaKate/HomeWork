package test.home_work_3;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregationNew {

    private ICalculator calc7;
    public CalculatorWithCounterAutoAgregationNew(ICalculator someCalculator) {
        this.calc7 = someCalculator;
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

package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator calc11;
    private int i = 0;
    public CalculatorWithCounterAutoAgregationInterface (ICalculator someICalculator) {
        this.calc11 = someICalculator;
    }
    public double divide(double a, double b) {
        i++;
        return calc11.divide(a, b);
    }
    public double multiply(double a, double b) {
        i++;
        return calc11.multiply(a, b);
    }
    public int subtract (int a, int b) {
        i++;
        return calc11.subtract(a, b);
    }
    public double add (double a, double b) {
        i++;
        return calc11.add(a, b);
    }
    public double pow (double a, int b) {
        i++;
        return calc11.pow(a, b);
    }
    public double module (double a) {
        i++;
        return calc11.module(a);
    }
    public double sqrt (int a) {
        i++;
        return calc11.sqrt(a);
    }
    long getCountOperation() {
        return i;
    }

    public int getI() {
        return i;
    }
}

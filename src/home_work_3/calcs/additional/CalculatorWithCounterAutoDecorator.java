package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calc13;
    private int i = 0;
    public CalculatorWithCounterAutoDecorator (ICalculator someICalculator) {
        this.calc13 = someICalculator;
    }
    public double divide(double a, double b) {
        i++;
        return calc13.divide(a, b);
    }
    public double multiply(double a, double b) {
        i++;
        return calc13.multiply(a, b);
    }
    public int subtract (int a, int b) {
        i++;
        return calc13.subtract(a, b);
    }
    public double add (double a, double b) {
        i++;
        return calc13.add(a, b);
    }
    public double pow (double a, int b) {
        i++;
        return calc13.pow(a, b);
    }
    public double module (double a) {
        i++;
        return calc13.module(a);
    }
    public double sqrt (double a) {
        i++;
        return calc13.sqrt(a);
    }
    long getCountOperation() {
        return i;
    }

    public int getI() {
        return i;
    }
    public ICalculator getDecorator(){
        return calc13;
    }
}

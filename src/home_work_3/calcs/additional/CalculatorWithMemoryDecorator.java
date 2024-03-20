package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calc14;
    private double var;
    public CalculatorWithMemoryDecorator(ICalculator someICalculator) {
        this.calc14 = someICalculator;
    }
    public double divide(double a, double b) {
        var = calc14.divide(a, b);
        return var;
    }
    public double multiply(double a, double b) {
        var = calc14.multiply(a, b);
        return var;
    }
    public int subtract (int a, int b) {
        return calc14.subtract(a, b);
    }
    public double add (double a, double b) {
        var = calc14.add(a, b);
        return var;
    }
    public double pow (double a, int b) {
        var = calc14.pow(a, b);
        return var;
    }
    public double module (double a) {
        var = calc14.module(a);
        return var;
    }
    public double sqrt (double a) {
        var = calc14.sqrt(a);
        return var;
    }
    public void save() {
        var = var;
    }

    public double load(){
        return var;
    }
    public ICalculator getDecorator(){
        return calc14;
    }
}

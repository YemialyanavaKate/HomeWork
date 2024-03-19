package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator calc12;
    private double var;
    public CalculatorWithMemory (ICalculator someICalculator) {
        this.calc12 = someICalculator;
    }
    public double divide(double a, double b) {
        var = calc12.divide(a, b);
        return var;
    }
    public double multiply(double a, double b) {
        var = calc12.multiply(a, b);
        return var;
    }
    public int subtract (int a, int b) {
        return calc12.subtract(a, b);
    }
    public double add (double a, double b) {
        var = calc12.add(a, b);
        return var;
    }
    public double pow (double a, int b) {
        var = calc12.pow(a, b);
        return var;
    }
    public double module (double a) {
        var = calc12.module(a);
        return var;
    }
    public double sqrt (int a) {
        var = calc12.sqrt(a);
        return var;
    }
    public void save() {
        var = var;
    }

    public double load(){
        return var;
    }
}

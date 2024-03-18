package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
// класс, который переопределяет 3 метода родительского класса CalculatorWithOperator
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    //private double pow;
    public double pow(double a, int b) {
        return Math.pow(a, b);
    }
    public double module(double a) {
        return Math.abs(a);
    }
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

}

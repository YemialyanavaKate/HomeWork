package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithMemory;
//import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc12 = new CalculatorWithOperator();
        CalculatorWithMemory calc12New = new CalculatorWithMemory(calc12);

        calc12New.divide(28, 5);
        calc12New.save();
        calc12New.pow(calc12New.load(), 2);
        calc12New.save();
        calc12New.add(4.1, calc12New.load());
        calc12New.save();
        calc12New.add(calc12New.load(), calc12New.multiply(15, 7));
        System.out.printf("%.2f%n", calc12New.load()); // 140.46
    }
}

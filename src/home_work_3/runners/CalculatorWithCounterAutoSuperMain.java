package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
// класс с калькулятором, в котором автоматический счетчик в каждой математической апперации
public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc5 = new CalculatorWithCounterAutoSuper();

        double var1 = calc5.divide(28, 5); //5,6
        double var2 = calc5.pow(var1,2); //31,36
        double var3 = calc5.multiply(15, 7); //105,00
        double var4 = calc5.add(var2, var3); //136,36
        double result = calc5.add(var4, 4.1); //140,46

        long i = calc5.getCountOperation();

        System.out.printf("%.2f\n", var1);
        System.out.printf("%.2f\n", var2);
        System.out.printf("%.2f\n", var3);
        System.out.printf("%.2f\n", var4);
        System.out.printf("%.2f\n", result);
        System.out.println("Kоличество использований калькулятора " + i);
    }
}

package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite implements ICalculatorTask7 {

     private CalculatorWithMathCopy calc6 = new CalculatorWithMathCopy();
     private int i = 0;

     public double divide(double a, double b) {
          i++;
          return calc6.divide(a, b);
     }

     @Override
     public double multiply(double a, double b) {
          i++;
          return calc6.multiply(a, b);
     }

     @Override
     public int subtract(int a, int b) {
          i++;
          return calc6.subtract(a, b);
     }

     @Override
     public double add(double a, double b) {
          i++;
          return calc6.add(a, b);
     }

     @Override
     public double mathPow(double a, int b) {
          i++;
          return calc6.pow(a, b);
     }

     @Override
     public double mathABS(double a) {
          i++;
          return calc6.module(a);
     }

     @Override
     public double mathSqrt(int a) {
          i++;
          return calc6.sqrt(a);
     }

     long getCountOperation() {
          return i;
     }

     public int getI() {
          return i;
     }
}

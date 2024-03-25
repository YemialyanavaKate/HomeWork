package home_work_3.calcs.additional;


import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite{

     private CalculatorWithMathCopy calc6;
     private long i = 0;
     public CalculatorWithCounterAutoComposite() {
          this.calc6 = new CalculatorWithMathCopy();
     }

     public double divide(double a, double b) {
          i++;
          return calc6.divide(a, b);
     }


     public double multiply(double a, double b) {
          i++;
          return calc6.multiply(a, b);
     }


     public int subtract(int a, int b) {
          i++;
          return calc6.subtract(a, b);
     }


     public double add(double a, double b) {
          i++;
          return calc6.add(a, b);
     }


     public double mathPow(double a, int b) {
          i++;
          return calc6.pow(a, b);
     }


     public double mathABS(double a) {
          i++;
          return calc6.module(a);
     }


     public double mathSqrt(int a) {
          i++;
          return calc6.sqrt(a);
     }

     public long getCountOperation() {
          return i;
     }

     /*public long getI() {
          return i;
     }*/
}

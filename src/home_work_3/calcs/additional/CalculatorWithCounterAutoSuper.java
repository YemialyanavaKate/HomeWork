package home_work_3.calcs.additional;
// класс с реализацией автоматического счетчика в каждой математической апперации
import home_work_3.calcs.simple.CalculatorWithMathExtends;
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int iDivide = 0;
    private int iMultiply = 0;
    private int iSubtract = 0;
    private int iAdd = 0;
    private int iPow = 0;
    private int iModule = 0;
    private int iSqrt = 0;
    public double divide(double a, double b) {
        iDivide++;
        return super.divide(a, b);
    }
    public double multiply(double a, double b) {
        iMultiply++;
        return super.multiply(a, b);
    }
    public int subtract(int a, int b) {
        iSubtract++;
        return super.subtract(a, b);
    }
    public double add(double a, double b){
        iAdd++;
        return super.add(a, b);
    }
    public double pow(double a, int b){
        iPow++;
        return super.pow(a, b);
    }

    @Override
    public double module(double a) {
        iModule++;
        return super.module(a);
    }

    @Override
    public double sqrt(double a) {
        iSqrt++;
        return super.sqrt(a);
    }

    public long getCountOperation() {
        return iDivide + iMultiply + iSubtract + iAdd + iPow + iModule + iSqrt;
    }
}

package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private int i;
    public void incrementCountOperetion(){
        i++;
    }
    public long getCountOperation() {

        return i;
    }
}

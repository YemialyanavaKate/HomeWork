package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calc8;
    private CalculatorWithMathCopy calc9;
    private CalculatorWithMathExtends calc10;
    private int i = 0;

    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithOperator someCalculatorWithOperator) {
        this.calc8 = someCalculatorWithOperator;
    }
    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathCopy someCalculatorWithMathCopy) {
        this.calc9 = someCalculatorWithMathCopy;
    }
    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithMathExtends someCalculatorWithMathExtends) {
        this.calc10 = someCalculatorWithMathExtends;
    }


        public double divide(double a, double b) {
            if (calc9 == null && calc10 == null) {
                i++;
                return calc8.divide(a, b);
            } else if (calc8 == null && calc10 == null) {
                i++;
                return calc9.divide(a, b);
            } else {
                i++;
                return calc10.divide(a, b);
            }
        }
        public double multiply(double a, double b) {
            if (calc9 == null && calc10 == null) {
                i++;
                return calc8.multiply(a, b);
            } else if (calc8 == null && calc10 == null) {
                i++;
                return calc9.multiply(a, b);
            } else {
                i++;
                return calc10.multiply(a, b);
            }
        }
    public int subtract (int a, int b) {
        if (calc9 == null && calc10 == null) {
            i++;
            return calc8.subtract(a, b);
        } else if (calc8 == null && calc10 == null) {
            i++;
            return calc9.subtract(a, b);
        } else {
            i++;
            return calc10.subtract(a, b);
        }
    }
    public double add (double a, double b) {
        if (calc9 == null && calc10 == null) {
            i++;
            return calc8.add(a, b);
        } else if (calc8 == null && calc10 == null) {
            i++;
            return calc9.add(a, b);
        } else {
            i++;
            return calc10.add(a, b);
        }
    }
    public double pow (double a, int b) {
        if (calc9 == null && calc10 == null) {
            i++;
            return calc8.pow(a, b);
        } else if (calc8 == null && calc10 == null) {
            i++;
            return calc9.pow(a, b);
        } else {
            i++;
            return calc10.pow(a, b);
        }
    }
    public double modul (int a) {
        if (calc9 == null && calc10 == null) {
            i++;
            return calc8.module(a);
        } else if (calc8 == null && calc10 == null) {
            i++;
            return calc9.module(a);
        } else {
            i++;
            return calc10.module(a);
        }
    }
    public double sqrt (int a) {
        if (calc9 == null && calc10 == null) {
            i++;
            return calc8.sqrt(a);
        } else if (calc8 == null && calc10 == null) {
            i++;
            return calc9.sqrt(a);
        } else {
            i++;
            return calc10.sqrt(a);
        }
    }

            long getCountOperation() {
                return i;
            }

            public int getI() {
                return i;
            }
    }


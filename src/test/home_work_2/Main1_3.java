package test.home_work_2;

import java.util.Scanner;

public class Main1_3 {
    public static double pow (double a, int b) {
        double result = 1;
        for ( int x = 1; x <= b; x++) {
            result = result * a;
        }
        System.out.println(a + " ^ " + b + " = " + result);
        return result;
    }
}

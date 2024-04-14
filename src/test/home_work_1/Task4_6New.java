package test.home_work_1;

import java.util.Scanner;

public class Task4_6New {
    public String leapYear(int a) {
        String x;
        if (a % 4 != 0) {
            x = "Это не високосный год";
        } else if (a % 100 != 0) {
            x ="Это високосный год";
        } else if (a % 400 == 0) {
            x = "Это високосный год";
        } else {
            x = "Это не високосный год";
        }
        return x;
    }
}
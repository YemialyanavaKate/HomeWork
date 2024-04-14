package test.home_work_1;

import java.util.Scanner;

public class Task4_4New {
    public String conversion(int a, char ch) {
        String x;
        if (ch == 'b') {
            long bt = a * 1024;
            x = "В байтах:" + bt;
         return x;
        } else if (ch == 'k'){
            double kbt = a * 1.0 / 1024;
            x = "В килобайтах:" + kbt;
            return x;
                } else {
            x = "Не введены требуемые символы 'b' или 'k'";
        }
        return x;
    }
}

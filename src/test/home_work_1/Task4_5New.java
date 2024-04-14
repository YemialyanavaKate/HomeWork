package test.home_work_1;

import java.util.Scanner;

public class Task4_5New {
    public String codASCII(int a) {
        String x;
        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))  {
         x = "Это код английской буквы";
        }  else {
            x = "Это не код английской буквы, а другой символ";
        }
        return x;
    }
}

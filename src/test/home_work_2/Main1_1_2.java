package test.home_work_2;

import java.util.Scanner;

public class Main1_1_2 {
    public static int recursion(int number) {

        if (number == 1) {
            return 1;
        }
        int f = recursion(number - 1) * number;
        return f;
    }

        public static void print (int a) {
        int i = 1;
        while (i <= a) {
            System.out.print(i);
            if (i != a){
                System.out.print(" * ");
            }
            i++;
        }
    }
}
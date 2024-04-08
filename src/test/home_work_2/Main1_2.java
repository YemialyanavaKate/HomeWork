package test.home_work_2;

import java.util.Scanner;

public class Main1_2 {

    public static int multy (int a) {

        String text = String.format("%d", a);
        int multi = 1;
        int k;
        while ( a != 0) {
            k = a % 10;
            multi = multi * k;
            a = a / 10;
        }
        int j = 0;
        int length = text.length();
        while ( j < length) {
            System.out.print(text.charAt(j));
            if (j < length - 1) {
                System.out.print(" * ");
            }
            j++;
        }
        System.out.println(" = " + multi);
        return multi;
    }
    /*
} else {
        if (console.hasNextDouble()) {
        System.out.println(" Введено не целое число");
            } else {
                    System.out.println(" Введено не число");
            }
                    }*/
}
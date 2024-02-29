package home_work_2.loops;

import java.util.Scanner;

public class Main1_2 {

    //public static final int MIN_NUMERIC_FOR_INPUT = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число a=");

        /*int j = 0;
        String text = console.nextLine();
        int leight = text.length();
        while ( j <= leight-1) {
            System.out.print(text.charAt(j) + "*");
            j++;
        }*/

        if (console.hasNextInt()) {
            int a = console.nextInt();
            int multi = 1;
            int k;
            int i = 0;
            while (a != 0) {
                k = a % 10;
                System.out.print(k + " * ");
                multi = multi * k;
                a = a / 10;
                i++;
            }
            System.out.println(" = " + multi);
        } else {
            if (console.hasNextDouble()) {
                System.out.println(" Введено не целое число");
            } else {
                System.out.println(" Введено не число");
            }
        }
    }
}
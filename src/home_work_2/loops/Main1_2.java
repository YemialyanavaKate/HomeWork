package home_work_2.loops;

import java.util.Scanner;

public class Main1_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число a=");

        if (console.hasNextInt()) {
            int a = console.nextInt();
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
        } else {
            if (console.hasNextDouble()) {
                System.out.println(" Введено не целое число");
            } else {
                System.out.println(" Введено не число");
            }
        }
    }
}
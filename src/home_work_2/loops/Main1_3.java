package home_work_2.loops;

import java.util.Scanner;

public class Main1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дробное число, которое будем возводить в степень a=");
        double a = console.nextDouble();
        System.out.println("Введите степень, в которую будем возводить число (положительное, целое)b=");
        int b = console.nextInt();
        double result = 1;
        for ( int x = 1; x <= b; x++) {
            result = result * a;
        }
        System.out.println(a + " ^ " + b + " = " + result);
    }
}

package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите значение 'a' ");
        int a = console.nextInt();
        System.out.println("Введите значение 'b' ");
        int b = console.nextInt();
        System.out.println("Введите значение 'c' ");
        int c = console.nextInt();

        String result = "Среднее значение из трех чисел:";
        if (a < b  && b < c || c < b && b < a) {
            System.out.println(result + b);
        } else if (b < a && a < c || c < a && a < b) {
            System.out.println(result + a);
        } else {
            System.out.println(result + c);
        }

    }
}

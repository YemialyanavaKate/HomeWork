package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int a = console.nextInt();

        if (a % 4 != 0) {
            System.out.println("Это не високосный год");
        } else if (a % 100 != 0) {
            System.out.println("Это високосный год ");
        } else if (a % 400 == 0) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }
}
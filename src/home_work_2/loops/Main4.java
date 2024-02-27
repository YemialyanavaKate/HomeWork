package home_work_2.loops;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");

        if (console.hasNextDouble()) {
        System.out.println("Введено не целое число");
        }
        //if (!(console.hasNextDouble() || console.hasNextInt())) {
        //    System.out.println("Введено не число");
        //}
        else System.out.println("Ввели верно!");
    }
}

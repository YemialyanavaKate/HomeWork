package test.home_work_2;

import java.util.Scanner;

public class Main1_1_2 {
    public static int recursion(int number) {

        if (number == 1) {
            return 1;
        }

        return recursion(number - 1) * number;
    }

        /*public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите целое положительное число:");
            int number = Integer.parseInt(console.nextLine());
            System.out.println(recursion(number));
    }*/
}
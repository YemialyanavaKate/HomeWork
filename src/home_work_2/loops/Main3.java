package home_work_2.loops;

import java.util.Scanner;

public class Main3 {

    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean checkInput;
        System.out.println("Введите целое положительное число:");
        // boolean b = console instanceof String;
        int number = Integer.parseInt(console.nextLine());
        checkInput = number < MIN_NUMERIC_FOR_INPUT;

        if (checkInput) {
            System.out.println("Ошибка, введите значение от 1 и выше");
        } else if (console.hasNextDouble()) {
            System.out.println("Введено не целое число");
        }
           // else if (b) {
            System.out.println("Введено не число");
        }

    }


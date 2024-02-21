package HomeWork1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите значение 'a' ");
        int a = console.nextInt();
        int aModul = Math.abs(a);

        System.out.println("Введите значение 'b' ");
        int b = console.nextInt();
        double aSqure = Math.pow(a, 2);

        System.out.println("Модуль числа 'a' " + aModul);
        System.out.println("Квадрат числа 'a' " + aSqure);
    }
}

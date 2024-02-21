package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число"); // 00010010
        int a = console.nextInt();
        System.out.println("Введите второе число"); // 00011011
        int b = console.nextInt();

        int resultAnd = a & b; // 00010010
        int resultOr = a | b; // 00011011

        System.out.println("Результат побитового AND:" + resultAnd);
        System.out.println("Результат побитового OR:" + resultOr);
    }

}

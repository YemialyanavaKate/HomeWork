package home_work_1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число (код символа из таблицы ASCII)");
        long a = console.nextLong();

        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))  {
         System.out.println("Это код английской буквы");
        }  else {
            System.out.println("Это не код английской буквы, а другой символ");
        }

    }
}

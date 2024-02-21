package home_work_1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое значение больше 0");
        long a = console.nextLong();
        System.out.println("Если перевести в байты введите 'b', если в килобайты введите 'k'");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch == 'b') {
            long bt = a * 1024;
         System.out.println("В байтах:" + bt);
        } else if (ch == 'k'){
            double kbt = a * 1.0 / 1024;
            System.out.println("В килобайтах" + kbt);
                } else {
            System.out.println("Не введены требуемые символы 'b' или 'k'");
        }

    }
}

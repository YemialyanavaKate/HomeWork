package home_work_2.loops;

import java.util.Scanner;

public class Main1_5 {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите натуральное число a=");
            int a = console.nextInt();
            int m = a % 10;
            a = a / 10;

            while (a > 0) {
                if (a % 10 > m){
                    m = a % 10;}
                a = a / 10;
            }
            System.out.println("Наибольшая цифра введенного числа = " + m);

        main5_2();
        main5_3();
        main5_4();
        main5_5();
        main5_6();
        }

        static void main5_2(){
            int z = 0 ;
            int c = 0;
            int b = 100;
            for (int i = 0; i < 1000; i++) {
                int randomNumber = c + (int) (Math.random() * b);
                if (randomNumber % 2 == 0) {
                    z = z+1;
                }
            }
            System.out.printf("Вероятность четных случайных чисел в процентах от общего колличества "+"%.2f\n",(float)z/1000*100);
            }

        static void main5_3() {
        Scanner console1_5_3 = new Scanner(System.in);
        System.out.println("Введите натуральное число k=");
        int k = console1_5_3.nextInt();
        int even = 0;
        int odd = 0;

        while (k > 0) {
            if (k % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
            k = k / 10;
        }
        System.out.println("Четных цифр в вашем числе = " + even);
        System.out.println("Нечетных цифр в вашем числе = " + odd);
        }

        static void main5_4() {
            Scanner console1_5_4 = new Scanner(System.in);
            System.out.println("Сколько цифр ряда Фибоначчи вывести на экран? ");
            int f = console1_5_4.nextInt();
            int f1 = 1;
            int f2 = 2;
            int b1;
            System.out.printf("%d %d ", f1, f2);

            for (int i1 = 3; i1 <= f; i1++) {
                System.out.print(f1 + f2 + " ");
                b1 = f1;
                f1 = f2;
                f2 = b1 + f1;
            }
            System.out.print("\n");
        }

        static void main5_5() {
        Scanner console1_5_5 = new Scanner(System.in);
        System.out.println("Введите натуральное число: минимальное число ряда min=");
        int min = console1_5_5.nextInt();
        System.out.println("Введите натуральное число: максимальное число ряда max=");
        int max = console1_5_5.nextInt();
        System.out.println("Введите натуральное число: шаг числового ряда step=");
        int step = console1_5_5.nextInt();

        for (int m = min; min <= max; min += step) {
            System.out.print(min + " ");
        }
            System.out.print("\n");
        }

        static void main5_6() {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите натуральное число p=");
        int p = number.nextInt();
        int r = p % 10;
        p = p / 10;

        while (p > 0) {
            System.out.print(r);
            r = p % 10;
            p = p / 10;
        }
        System.out.println(r);
    }

    }

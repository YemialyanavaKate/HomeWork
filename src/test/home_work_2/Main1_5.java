package test.home_work_2;

import java.util.Scanner;

public class Main1_5 {
    public static int main5_1(int a) {
        int m = a % 10;
        a = a / 10;

        while (a > 0) {if (a % 10 > m){
            m = a % 10;}
            a = a / 10;
        }
        System.out.println("Наибольшая цифра введенного числа = " + m);
        return m;
    }
    public static float main5_2(){
        int z = 0 ;
        int c = 0;
        int b = 100;
        for (int i = 0; i < 1000; i++) {
            int randomNumber = c + (int) (Math.random() * b);
            if (randomNumber % 2 == 0) {z = z+1;
            }
        }
        System.out.printf("Вероятность четных случайных чисел в процентах от общего колличества "+"%.2f\n",(float)z/1000*100);
        return (float)z/1000*100;
    }

    public static int main5_3(int k) {
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
        int sum = even + odd;
        return sum;
        }
        public static String main5_4(int f) {
            int f1 = 1;
            int f2 = 2;
            int b1;
            String  message = "1 2 ";

            for (int i1 = 3; i1 <= f; i1++) {
                b1 = f1;
                f1 = f2;
                f2 = b1 + f1;
                message = message + f2;
                if (i1 < f){
                    message = message + " ";
                }
            }
           return message;
        }
        public static String main5_5(int min, int max, int step) {
            String  message = "";
            for (int m = min; min <= max; min += step) {
                message = message + min + " ";
            }
            return message;
            }

        public static String main5_6(int p) {
        int r = p % 10;
        p = p / 10;
        String  message = "";

        while (p > 0) {
            message = message + r;
            r = p % 10;
            p = p / 10;
        }
        return message + r;
    }

    }

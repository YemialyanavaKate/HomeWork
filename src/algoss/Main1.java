package algoss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner console1 = new Scanner(System.in);
        System.out.println("Введите целое число (колличество оценок)");
        int a = console1.nextInt();
        if (a < 1 || a > 100_000){
            System.out.println("Неверные данные");
        }

        Scanner console2 = new Scanner(System.in);
        System.out.println("Введите оценки");
        int b = console2.nextInt();
        if (b < 2 || b > 5){
            System.out.println("Неверные данные");
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            list.add(b);
        }

        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        int maxNumber5 = 0;
        int number5 = 0;

        for (Integer value : list) {

            for (int i = 0; i <= 7; i++) {

                if (list.get(i) == 2 || list.get(i) == 3) {
                    System.out.println("-1");
                } else if (list.get(i) == 4) {
                    list4.add(list.get(i));
                } else if (list.get(i) == 5) {
                    list5.add(list.get(i));
                }
                number5 = list5.size();
            }
            if (number5 >= maxNumber5){

            }
        }


    }
}

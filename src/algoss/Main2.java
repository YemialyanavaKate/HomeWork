package algoss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner console1 = new Scanner(System.in);
        System.out.println("Введите целые числа n и m(размер матрицы)");

        int n = console1.nextInt();
        int m = console1.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            Scanner console = new Scanner(System.in);
            System.out.println("Вводите строки матрицы");

            list.add(console.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }
}

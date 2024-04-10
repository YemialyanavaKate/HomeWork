package test.home_work_1;

public class Task4_2New {
    public int average(int a, int b, int c) {
        String result = "Среднее значение из трех чисел:";
        if (a < b  && b < c || c < b && b < a) {
            System.out.println(result + b);
            return b;
        } else if (b < a && a < c || c < a && a < b) {
            System.out.println(result + a);
            return a;
        } else {
            System.out.println(result + c);
            return c;
        }

    }
}

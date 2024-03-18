package home_work_3.runners;

public class Check {
    public static void main(String[] args) {

        double a = 5.6;
        int b = 2;
        double result = 1;
            for (int i = 1; i <= b; i++) {
                result = a * result;
            }
        System.out.println("Число в степени " + result);

        /*if (a >= 0) {
            double result = 1;
            for (int i = 0; i < b; i++) {
                result = a * result;
            }
        }*/

        /*double result = 0;
        for (int i = 1; i < 0; i++) {
            if (0 / i == i) {
                result = i;
                break;
            }
        }
        System.out.println("Корень из числа " + result);*/

    }
}

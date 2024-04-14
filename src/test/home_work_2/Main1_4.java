package test.home_work_2;

public class Main1_4 {

   public static final long BIG_NUMBER = 9_223_372_036_854_775_807L;
    public static final long BIG_NEGATIV_NUMBER = -9_223_372_036_854_775_808L;
    public static long Overflow (int number) {
        long a = 1;
        if (number == 1) {
            return 1;
        }

        if (number == 0) {
            return 0;
        }
        long f = a * number;
        if (f > BIG_NUMBER) {
            return f;
        }

      //  f = a * number;
        f = Overflow(number) * a;
        return f;
    }
}
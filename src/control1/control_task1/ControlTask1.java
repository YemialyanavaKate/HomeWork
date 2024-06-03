package control1.control_task1;

public class ControlTask1 {
    public static int Choice (int a, int b, int c){
        int x;
        if ((a > b && a > c)) {
            x = a + c;
            return x;
        } else {
            x = b;
            return x;
        }
    }
    public static double Average (int a, int b, int c){
        double x = (a + b + c)/3;
        return x;
        }
}

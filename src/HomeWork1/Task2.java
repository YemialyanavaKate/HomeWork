package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int k = 8;
        int a1 = 5 + 2 / k;

        int a2 = (5 + 2) / k;

        int m = 2;
        int a3 = (5 + m++) / k;

        int t = 2;
        int a4 = (5 + t++) / --k;

        int k1 = 8;
        int t1 = 2;
        int a5 = (5 * 2 >> t1++) / --k1;

        int k2 = 8;
        int t2 = 2;
        int a6 = (5 + 7 > 20 ? 68 : 22 * 2 >> t2++) / --k2;

        int k3 = 8;
        int t3 = 2;
        // int a7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> t3++) / --k3; // оператор '/' не можeт быть применен, т.к. значение в скобках может быть типа boolean

        boolean a8 = 6 - 2 > 3 && 12 * 12 <= 119;
        boolean a9 = true && false;

        System.out.println("2.1="+a1);
        System.out.println("2.2="+a2);
        System.out.println("2.3="+a3);
        System.out.println("2.4="+a4);
        System.out.println("2.5="+a5);
        System.out.println("2.6="+a6);
        System.out.println("2.8="+a8);
        System.out.println("2.9="+a9);

    }
}

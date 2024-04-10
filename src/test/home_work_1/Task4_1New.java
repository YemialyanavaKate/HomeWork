package test.home_work_1;

public class Task4_1New {

    public int evenNumber(int a, int b) {
        int z;
        int c;
        if (a % 2 == 0 && b % 2 == 0) {
            z = a + 1;
            System.out.println("Число a НЕЧEТНОЕ:" + z);
            return c = z;
        } else if (a % 2 == 1 && b % 2 == 1){
            z = a + 1;
            System.out.println("Число b НЕЧEТНОЕ:" + b);
            return c = b;
        } else if (a % 2 == 1){
            System.out.println("Число a НЕЧЕТНОЕ:" + a);
            return c = a;
        } else {
            System.out.println("Число b НЕЧEТНОЕ" + b);
            return c = b;
        }
    }
}

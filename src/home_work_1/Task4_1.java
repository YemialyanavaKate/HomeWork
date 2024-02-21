package HomeWork1;

public class Task4_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        int randomNumber1 = a + (int) (Math.random() * b);
        int randomNumber2 = a + (int) (Math.random() * b);

        if (randomNumber1 % 2 == 0 && randomNumber2 % 2 == 0) {
            int z = randomNumber1 + 1;
            System.out.println("Случайное число №1 НЕЧEТНОЕ:" + z);
        } else if (randomNumber1 % 2 == 1 && randomNumber2 % 2 == 1){
            int z = randomNumber1 + 1;
            System.out.println("Случайное число №2 НЕЧEТНОЕ:" + randomNumber2);
        } else if (randomNumber1 % 2 == 1){
            System.out.println("Случайное число №1 НЕЧЕТНОЕ:" + randomNumber1);
        } else {
            System.out.println("Случайное число №2 НЕЧEТНОЕ" + randomNumber2);
        }

    }
}

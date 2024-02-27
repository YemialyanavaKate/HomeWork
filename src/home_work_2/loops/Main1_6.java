package home_work_2.loops;

public class Main1_6 {
    public static void main(String[] args) {
        int i = 2;
        for (int j = 1; j <= 10; j++) {
            for (i = 2; i <= 5; i++) {
                    if ((i * j) / 10 >= 1 && j < 10) {
                    System.out.print(i + "*" + j + "=" + (i * j) + " | ");
                }
                    else if ((i * j) / 10 >= 1 && j == 10) {
                    System.out.print(i + "*" + j + "=" + (i * j) + "| ");
                }
                    else {
                System.out.print(i + "*" + j + "=" + (i * j) + "  | ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");

        for (int j = 1; j <= 10; j++) {
            for (i = 6; i <= 9; i++) {
                if ((i * j) / 10 >= 1 && j < 10) {
                    System.out.print(i + "*" + j + "=" + (i * j) + " | ");
                }
                else if ((i * j) / 10 >= 1 && j == 10) {
                    System.out.print(i + "*" + j + "=" + (i * j) + "| ");
                }
                else {
                    System.out.print(i + "*" + j + "=" + (i * j) + "  | ");
                }
            }
            System.out.println();
        }

    }
    }


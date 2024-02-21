package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        String friend1 = "Вася";
        String friend2 = "Анастасия";

        if (Objects.equals(name, friend1) ) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        }
         if ((Objects.equals(name, friend2))) {
                System.out.println("Я тебя так долго ждал!");
         } else {
             System.out.println("Добрый день, а кто вы?");
         }
         }
    }

package test.home_work_1;

import java.util.Scanner;

public class Task6_3New {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        switch (name) {
            case "Вася":
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
            break;
            case "Анастасия":
            System.out.println("Я тебя так долго ждал!");
            break;
            default:
            System.out.println("Добрый день, а кто вы?");
        }
    }
    }

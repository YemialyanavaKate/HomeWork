package test.home_work_1;

import test.home_work_1.api.ICommunicationPrinter;

import java.util.Objects;

public class Task6_1New implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        } else {
            if (Objects.equals(name, "Анастасия")) {
                System.out.println("Я тебя так долго ждал!");
            } else {
                System.out.println("Добрый день, а кто вы?");
            }
        }

        return name;
    }
}
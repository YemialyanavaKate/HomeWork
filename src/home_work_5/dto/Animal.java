package home_work_5.dto;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Animal {
    private int age;
    private String nick;

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}

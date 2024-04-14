package test.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task6Test {
    @DisplayName("Task6_1 - приветствие для Васи")
    @Test
    public void TestTask6_1() {

        Task6_1New hello1 = new Task6_1New();
        hello1.welcom("Вася");
    }
    @DisplayName("Task6_2 - приветствие для Анастасии")
    @Test
    public void TestTask6_2() {

        Task6_2New hello2 = new Task6_2New();
        hello2.welcom("Анастасия");

    }

    @DisplayName("Task6_3 - приветствие для незнакомца")
    @Test
    public void TestTask6_3() {

        Task6_2New hello3 = new Task6_2New();
        hello3.welcom("Катя");

    }

}

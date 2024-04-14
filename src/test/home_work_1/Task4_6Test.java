package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_6Test {

    @DisplayName("Task4_6 - Вводим високосный год (не столетие)")
    @Test
    public void TestLeapYear() {
        Task4_6New z = new Task4_6New();
        Assertions.assertEquals("Это не високосный год", z.leapYear(2002));
    }

    @DisplayName("Task4_6 - Вводим високосный год (столетие)")
    @Test
    public void TestLeapYearCentury() {
        Task4_6New z = new Task4_6New();
        Assertions.assertEquals("Это високосный год", z.leapYear(800));
    }

    @DisplayName("Task4_6 - Вводим не високосный год (столетие)")
    @Test
    public void TestAnotherYearСentury() {
        Task4_6New z = new Task4_6New();
        Assertions.assertEquals("Это не високосный год", z.leapYear(300));
    }

    @DisplayName("Task4_6 - Вводим не високосный год")
    @Test
    public void TestAnotherYear() {
        Task4_6New z = new Task4_6New();
        Assertions.assertEquals("Это не високосный год", z.leapYear(2025));
    }
}

package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @DisplayName("Task5 - Будний день и не отпуск")
    @Test
    public void TestWorkdayNotVacation() {
        Task5 z = new Task5();
        Assertions.assertEquals("Пора идти на работу", z.sleepText(true, false));
    }

    @DisplayName("Task5 - Будний день и отпуск")
    @Test
    public void TestWorkdayVacation() {
        Task5 z = new Task5();
        Assertions.assertEquals("Можно спать дальше", z.sleepText(true, true));
    }

    @DisplayName("Task5 - Выходной и  не отпуск")
    @Test
    public void TestWeekendNotVacation() {
        Task5 z = new Task5();
        Assertions.assertEquals("Можно спать дальше", z.sleepText(false, false));
    }

    @DisplayName("Task5 - Выходной и отпуск")
    @Test
    public void TestWeekendVacation() {
        Task5 z = new Task5();
        Assertions.assertEquals("Можно спать дальше", z.sleepText(false, true));
    }
}

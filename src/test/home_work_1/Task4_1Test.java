package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_1Test {

    @DisplayName("Task4_1 - Генерация двух четных чисел")
    @Test
    public void TestTwoPositive() {
        Task4_1New even1 = new Task4_1New();

        Assertions.assertEquals(3, even1.evenNumber(2,4));
    }
    @DisplayName("Task4_1 - Генерация двух нечетных чисел")
    @Test
    public void TestTwoNegative() {
        Task4_1New even1 = new Task4_1New();

        Assertions.assertEquals(5, even1.evenNumber(3,5));
    }
    @DisplayName("Task4_1 - Генерация нуля и четного")
    @Test
    public void TestNullPositive() {
        Task4_1New even1 = new Task4_1New();

        Assertions.assertEquals(1, even1.evenNumber(0,4));
    }
    @DisplayName("Task4_1 - Генерация нечетного и нуля")
    @Test
    public void TestNegativeNull() {
        Task4_1New even1 = new Task4_1New();

        Assertions.assertEquals(3, even1.evenNumber(3,0));
    }
    @DisplayName("Task4_1 - Генерация двух нулей")
    @Test
    public void TestNull() {
        Task4_1New even1 = new Task4_1New();

        Assertions.assertEquals(1, even1.evenNumber(0,0));
    }
}

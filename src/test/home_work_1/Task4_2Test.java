package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_2Test {

    @DisplayName("Task4_2 - Три числа в порядке возрастания")
    @Test
    public void TestIncrease() {
        Task4_2New average = new Task4_2New();

        Assertions.assertEquals(6, average.average(1,6,9));
    }

    @DisplayName("Task4_2 - Три числа в порядке убывания")
    @Test
    public void TestDecrease() {
        Task4_2New average = new Task4_2New();

        Assertions.assertEquals(5, average.average(8,5,2));
    }
    @DisplayName("Task4_2 - Среднее на первом месте")
    @Test
    public void TestFirstNumber() {
        Task4_2New average = new Task4_2New();

        Assertions.assertEquals(11, average.average(11,6,19));
    }

    @DisplayName("Task4_2 - Среднее на последнем месте")
    @Test
    public void TestLastestNumber() {
        Task4_2New average = new Task4_2New();

        Assertions.assertEquals(9, average.average(8,16,9));
    }

}

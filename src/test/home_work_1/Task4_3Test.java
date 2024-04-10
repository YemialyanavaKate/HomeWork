package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_3Test {

    @DisplayName("Task4_3 - Первое больше второго и первое делится на второе")
    @Test
    public void TestFirstMoreSecondAndDivided() {
        Task4_3New delenie = new Task4_3New();

        Assertions.assertEquals("делится", delenie.delenie(12,6));
    }
    @DisplayName("Task4_3 - Первое больше второго и первое неделится на второе")
    @Test
    public void TestFirstMoreSecondAndNotDivided() {
        Task4_3New delenie = new Task4_3New();

        Assertions.assertEquals("не делится", delenie.delenie(12,2));
    }

    @DisplayName("Task4_3 - Первое меньше второго")
    @Test
    public void TestFirstLessSecond() {
        Task4_3New delenie = new Task4_3New();

        Assertions.assertEquals("не делится", delenie.delenie(2,7));
    }


}

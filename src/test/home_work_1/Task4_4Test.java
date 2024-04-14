package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_4Test {

    @DisplayName("Task4_4 - Перевод в байты")
    @Test
    public void TestInByte() {
        Task4_4New z = new Task4_4New();
       Assertions.assertEquals("В байтах:524288", z.conversion(512, 'b'));
    }

    @DisplayName("Task4_4 - Перевод в кбайты")
    @Test
    public void TestInKByte() {
        Task4_4New z = new Task4_4New();
        Assertions.assertEquals("В килобайтах:0.5", z.conversion(512, 'k'));
    }
    @DisplayName("Task4_4 - Перевести значение 0")
    @Test
    public void Test4_4Nuul() {
        Task4_4New z = new Task4_4New();
        Assertions.assertEquals("В байтах:0", z.conversion(0, 'b'));
    }
    @DisplayName("Task4_4 - Неверный ввод")
    @Test
    public void TestOther() {
        Task4_4New z = new Task4_4New();
        Assertions.assertEquals("Не введены требуемые символы 'b' или 'k'", z.conversion(512, 'е'));
    }
}

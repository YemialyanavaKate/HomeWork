package test.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_5Test {

    @DisplayName("Task4_5 - Вводим код английской буквы")
    @Test
    public void TestEnglishLetter() {
        Task4_5New z = new Task4_5New();
        Assertions.assertEquals("Это код английской буквы", z.codASCII(67));
    }

    @DisplayName("Task4_5 - Вводим не код английской буквы")
    @Test
    public void TestAnotherCharacter() {
        Task4_5New z = new Task4_5New();
        Assertions.assertEquals("Это не код английской буквы, а другой символ", z.codASCII(64));
    }

    @DisplayName("Task4_5 - Вводим 0")
    @Test
    public void TesNull() {
        Task4_5New z = new Task4_5New();
        Assertions.assertEquals("Это не код английской буквы, а другой символ", z.codASCII(0));
    }
}

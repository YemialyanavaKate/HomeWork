package test.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_5Test {

    @DisplayName("Task4_5 - Вводим код английской буквы")
    @Test
    public void TestEnglishLetter() {
        long a = 80;

        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))  {
            System.out.println("Это код английской буквы");
        }  else {
            System.out.println("Это не код английской буквы, а другой символ");
        }
    }

    @DisplayName("Task4_5 - Вводим не код английской буквы")
    @Test
    public void TestAnotherCharacter() {
        long a = 5;

        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))  {
            System.out.println("Это код английской буквы");
        }  else {
            System.out.println("Это не код английской буквы, а другой символ");
        }
    }

}

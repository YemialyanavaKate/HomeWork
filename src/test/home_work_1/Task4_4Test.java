package test.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_4Test {

    @DisplayName("Task4_4 - Перевод в байты")
    @Test
    public void TestInByte() {
        int a = 10_000;
        char ch = 'b';

        if (ch == 'b') {
            long bt = a * 1024;
            System.out.println("В байтах: " + bt);
        } else if (ch == 'k') {
            double kbt = a * 1.0 / 1024;
            System.out.println("В килобайтах: " + kbt);
        } else {
            System.out.println("Не введены требуемые символы 'b' или 'k'");
        }
    }

    @DisplayName("Task4_4 - Перевод в кбайты")
    @Test
    public void TestInKByte() {
        int a = 10_000;
        char ch = 'k';

        if (ch == 'b') {
            long bt = a * 1024;
            System.out.println("В байтах: " + bt);
        } else if (ch == 'k') {
            double kbt = a * 1.0 / 1024;
            System.out.println("В килобайтах: " + kbt);
        } else {
            System.out.println("Не введены требуемые символы 'b' или 'k'");
        }
    }

    @DisplayName("Task4_4 - Неверный ввод")
    @Test
    public void TestOther() {
        int a = 10_000;
        char ch = 't';

        if (ch == 'b') {
            long bt = a * 1024;
            System.out.println("В байтах: " + bt);
        } else if (ch == 'k') {
            double kbt = a * 1.0 / 1024;
            System.out.println("В килобайтах: " + kbt);
        } else {
            System.out.println("Не введены требуемые символы 'b' или 'k'");
        }
    }
}

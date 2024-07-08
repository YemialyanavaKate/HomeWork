package home_work_6.threads;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestThread {
    @DisplayName("Проверка создания каталога")
    @Test
    public void testDir1(){

        Assertions.assertNull(MainThreadsNew.choiceDir("gfchg"));

    }
    @DisplayName("Проверка создания каталога")
    @Test
    public void testDir2(){

        //assertThrows(IllegalArgumentException.class, () -> MainThreadsNew.choiceDir("zvgsxgsdgd"));
       /* boolean answer = Objects.requireNonNull(MainThreadsNew.choiceDir("HomeWork\\resources")).exists();

        Assertions.assertTrue(answer);*/

    }
}

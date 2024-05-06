package home_work_6.test;

import home_work_6.dto.EasySearch;
import home_work_6.dto.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testEasySearch {
    @DisplayName("Проверка первого слова")
    @Test
    public void testWord1(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Мама мыла раму", "Мама");
        Assertions.assertEquals(1,counter);

    }

    @DisplayName("Проверка последнего слова")
    @Test
    public void testWord2(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Мама мыла раму", "раму");
        Assertions.assertEquals(1,counter);

    }
    @DisplayName("Проверка любого слова, встречается дважды")
    @Test
    public void testWord3(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "Мама");
        Assertions.assertEquals(2,counter);

    }
    @DisplayName("Проверка слова, которого нет")
    @Test
    public void testWord4(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "мир");
        Assertions.assertEquals(-1,counter);

    }

    @DisplayName("Проверка слова (часть другого)")
    @Test
    public void testWord5(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "мыл");
        Assertions.assertEquals(-1,counter);

    }
    @DisplayName("Проверка слова в другом регистре")
    @Test
    public void testWord6(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "мама");
        Assertions.assertEquals(-1,counter);

    }
    @DisplayName("Проверка ввода пустой строки")
    @Test
    public void testWord7(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("", "Mама");
        Assertions.assertEquals(0,counter);

    }
    @DisplayName("Проверка ввода пустого слова для поиска")
    @Test
    public void testWord8(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Мама мыла раму", "");
        Assertions.assertEquals(-1,counter);

    }
    @DisplayName("Проверка слова из одной буквы")
    @Test
    public void testWord9(){
        EasySearch searchInText = new EasySearch();
        long counter = searchInText.search("Война и мир. Война и мир.", "и");
        Assertions.assertEquals(2,counter);

    }
}

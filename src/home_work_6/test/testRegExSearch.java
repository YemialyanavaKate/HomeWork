package home_work_6.test;

import home_work_6.dto.EasySearch;
import home_work_6.dto.RegExSearch;
import home_work_6.dto.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testRegExSearch {
    @DisplayName("Проверка первого слова")
    @Test
    public void testWord1(){
        RegExSearch searchInText = new RegExSearch();
        long counter = searchInText.search("Мама мыла раму", "Мама");
        Assertions.assertEquals(1,counter);

    }

    @DisplayName("Проверка последнего слова")
    @Test
    public void testWord2(){
        RegExSearch searchInText = new RegExSearch();
        long counter = searchInText.search("Мама мыла раму", "раму");
        Assertions.assertEquals(1,counter);

    }
    @DisplayName("Проверка любого слова, встречается дважды")
    @Test
    public void testWord3(){
        RegExSearch searchInText = new RegExSearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "Мама");
        Assertions.assertEquals(2,counter);

    }
    @DisplayName("Проверка слова, которого нет")
    @Test
    public void testWord4(){
        RegExSearch searchInText = new RegExSearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "мир");
        Assertions.assertEquals(0,counter);

    }

    @DisplayName("Проверка слова (часть другого")
    @Test
    public void testWord5(){
        RegExSearch searchInText = new RegExSearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "мыл");
        Assertions.assertEquals(0,counter);

    }
    @DisplayName("Проверка слова в другом регистре")
    @Test
    public void testWord6(){
        RegExSearch searchInText = new RegExSearch();
        long counter = searchInText.search("Мама мыла раму. Мама мыла раму", "мама");
        Assertions.assertEquals(0,counter);

    }
    @DisplayName("Проверка слова из одной буквы")
    @Test
    public void testWord7(){
        RegExSearch searchInText = new RegExSearch();
        long counter = searchInText.search("Война и мир. Война и мир.", "и");
        Assertions.assertEquals(2,counter);

    }
}

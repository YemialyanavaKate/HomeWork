package test.home_work_4;


import home_work_4.dto.DataContainer;
import home_work_4.dto.NumberComparator;
import home_work_4.dto.StringLengthComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainerTest {
   @DisplayName("Добавление не NULL в контейнер")
   @Test
   public void testAddNotNull(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add("Привет");
      String answer = container.get(index);
      Assertions.assertEquals(answer, "Привет");
   }

   @DisplayName("Добавление NULL в контейнер")
   @Test
   public void testAddNull(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add(null);
      Assertions.assertEquals(-1, index);

   }

   @DisplayName("Удаление по индексу из контейнера")
   @Test
   public void testDeieteByIndex(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add("Привет");
      container.delete(index);
      String answer = container.get(index);
      Assertions.assertNull(answer);
   }

   @DisplayName("Удаление элемента из контейнера")
   @Test
   public void testDeieteByItem(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      int index = container.add("Привет");
      container.delete("Привет");
      String answer = container.get(index);
      Assertions.assertNull(answer);
   }
   @DisplayName("Получение массива Integer")
   @Test
   public void testGetData(){
      DataContainer<Integer> container = new DataContainer<>(new Integer[0]);
      container.add(18);
      container.add(5);
      Integer[] data = container.getItems();
      Integer[] dataTest = {18,5};
      Assertions.assertArrayEquals(data,dataTest);
   }

   @DisplayName("Сортировка Integer")
   @Test
   public void testSortInteger(){
      DataContainer<Integer> container = new DataContainer<>(new Integer[0]);
      container.add(18);
      container.add(1);
      container.add(5);
      container.sort(new NumberComparator());
      Integer[] data = container.getItems();
      Integer[] dataTest = {1,5,18};
      Assertions.assertArrayEquals(data,dataTest);
   }

   @DisplayName("Сортировка String по длинне")
   @Test
   public void testSortStringLeght(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      container.add("i");
      container.add("hello");
      container.add("1");
      container.add("Как домашка");
      container.sort(new StringLengthComparator());
      String[] data = container.getItems();
      String[] dataTest = {"i","1","hello","Как домашка"};
      Assertions.assertArrayEquals(data,dataTest);
   }

   @DisplayName("Сортировка String по алфавиту")
   @Test
   public void testSortStringAlphabetict(){
      DataContainer<String> container = new DataContainer<>(new String[0]);
      container.add("Работаю");
      container.add("Как дела");
      container.add("Давай потом");
      container.sort(new StringLengthComparator());
      String[] data = container.getItems();
      String[] dataTest = {"Работаю","Как дела","Давай потом"};
      Assertions.assertArrayEquals(data,dataTest);
   }

   @DisplayName("Проверка toString")
   @Test
   public void testToString(){
      Integer[] data = {1, 2, 3, 777, 3};
      DataContainer<Integer> container = new DataContainer<>(data);

      String dataString = container.toString();
      String dataTest = "[1, 2, 3, 777, 3]";
      Assertions.assertEquals(dataString,dataTest);
   }
}

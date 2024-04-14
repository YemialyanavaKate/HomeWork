package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Main2_4_Test {

    @DisplayName("2.4.1 Сумма четных положительных элементов массива {1,2,3,4}")
    @Test
    public void testTwoFourOne1(){
        int[] array = {1,2,3,4};

        Assertions.assertEquals(6, Main2_4.main2_4_1(array));
    }

    @DisplayName("2.4.1 Сумма четных положительных элементов массива {1,2,3,4,0,2,2}")
    @Test
    public void testTwoFourOne2(){
        int[] array = {1,2,3,4,0,2,2};

        Assertions.assertEquals(10, Main2_4.main2_4_1(array));
    }
    @DisplayName("2.4.1 Сумма четных положительных элементов массива {0,0,0}")
    @Test
    public void testTwoFourOne3(){
        int[] array = {0,0,0};

        Assertions.assertEquals(0, Main2_4.main2_4_1(array));
    }

    @DisplayName("2.4.1 Сумма четных положительных элементов массива {1}")
    @Test
    public void testTwoFourOne4(){
        int[] array = {1};

        Assertions.assertEquals(0, Main2_4.main2_4_1(array));
    }
    @DisplayName("2.4.2 Максимальный из элементов массива с четными индексами {1,2,3,4,0,2,2}")
    @Test
    public void testTwoFourTwo1(){
        int[] array = {1,2,3,4,0,2,2};

        Assertions.assertEquals(3, Main2_4.main2_4_2(array));
    }

    @DisplayName("2.4.2 Максимальный из элементов массива с четными индексами {0,0,0}")
    @Test
    public void testTwoFourTwo2(){
        int[] array = {0,0,0};

        Assertions.assertEquals(0, Main2_4.main2_4_2(array));
    }

    @DisplayName("2.4.3 Элементы массива, которые меньше среднего арифметического {1,2,3,4,0,2,2}")
    @Test
    public void testTwoFourThree1() {
        int[] array = {1, 2, 3, 4, 0, 2, 2};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("1 0 ",Main2_4.main2_4_3(array));
    }

    @DisplayName("2.4.3 Элементы массива, которые меньше среднего арифметического {1,9,3,8,0,9,7}")
    @Test
    public void testTwoFourThree2() {
        int[] array = {1,9,3,8,0,9,7};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("1 3 0 ",Main2_4.main2_4_3(array));
    }

    @DisplayName("2.4.3 Элементы массива, которые меньше среднего арифметического {0,0,0}")
    @Test
    public void testTwoFourThree3() {
        int[] array = {0,0,0};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("",Main2_4.main2_4_3(array));
    }
    @DisplayName("2.4.3 Элементы массива, которые меньше среднего арифметического {1}")
    @Test
    public void testTwoFourThree4() {
        int[] array = {1};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("",Main2_4.main2_4_3(array));
    }

    @DisplayName("2.4.4 Найти два наименьших (минимальных) элемента массива {7, 1, 8, 3, 5, 9}")
    @Test
    public void testTwoFourFour1() {
        int[] array = {7, 1, 8, 3, 5, 9};
        System.out.println(Arrays.toString(array));
        System.out.println(Main2_4.main2_4_4(array));
        Assertions.assertEquals("1 3",Main2_4.main2_4_4(array));
    }

    @DisplayName("2.4.4 Найти два наименьших (минимальных) элемента массива {0, 5, 8, 3, 0, 9}")
    @Test
    public void testTwoFourFour2() {
        int[] array = {0, 5, 8, 3, 0, 9};
        System.out.println(Arrays.toString(array));
        System.out.println(Main2_4.main2_4_4(array));
        Assertions.assertEquals("0 0",Main2_4.main2_4_4(array));
    }
    @DisplayName("2.4.4 Найти два наименьших (минимальных) элемента массива {0, 0, 0, 0}")
    @Test
    public void testTwoFourFour3() {
        int[] array = {0, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Main2_4.main2_4_4(array));
        Assertions.assertEquals("0 0",Main2_4.main2_4_4(array));
    }
    @DisplayName("2.4.4 Найти два наименьших (минимальных) элемента массива {1}")
    @Test
    public void testTwoFourFour4() {
        int[] array = {1};
        System.out.println(Arrays.toString(array));
        System.out.println(Main2_4.main2_4_4(array));
        Assertions.assertEquals("1",Main2_4.main2_4_4(array));
    }

    @DisplayName("2.4.5 Сжать массив {7, 1, 8, 3, 5, 9}, удалив элементы, принадлежащие интервалу 2-4 ")
    @Test
    public void testTwoFourFive1() {
        int[] array = {7, 1, 8, 3, 5, 9};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("7 1 9 ",Main2_4.main2_4_5(array, 2,4));
    }

    @DisplayName("2.4.5 Сжать массив {7, 1, 8, 3, 5, 9}, удалив элементы, принадлежащие интервалу 1-3 ")
    @Test
    public void testTwoFourFive2() {
        int[] array = {7, 1, 8, 3, 5, 9};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("7 5 9 ",Main2_4.main2_4_5(array, 1,3));
    }

    @DisplayName("2.4.5 Сжать массив {7, 1, 8, 3, 5, 9}, удалив элементы, принадлежащие интервалу 0-2 ")
    @Test
    public void testTwoFourFive3() {
        int[] array = {7, 1, 8, 3, 5, 9};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("3 5 9 ",Main2_4.main2_4_5(array, 0,2));
    }

    @DisplayName("2.4.5 Сжать массив {7, 1, 8, 3, 5, 9}, удалив элементы, принадлежащие интервалу 3-5 ")
    @Test
    public void testTwoFourFive4() {
        int[] array = {7, 1, 8, 3, 5, 9};
        System.out.println(Arrays.toString(array));
        Assertions.assertEquals("7 1 8 ",Main2_4.main2_4_5(array, 3,5));
    }

    @DisplayName("2.4.6 Cумма цифр массива {1,2,3,4,0,2,2}")
    @Test
    public void testTwoFourSix1(){
        int[] array = {1,2,3,4,0,2,2};

        Assertions.assertEquals(14, Main2_4.main2_4_6(array));
    }

    @DisplayName("2.4.6 Cумма цифр массива {0,0,0}")
    @Test
    public void testTwoFourSix2(){
        int[] array = {0,0,0};

        Assertions.assertEquals(0, Main2_4.main2_4_6(array));
    }

    }


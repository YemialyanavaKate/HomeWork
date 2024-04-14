package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_5_Test {
    public static final int MIN_NUMERIC_FOR_INPUT = 1;

    @DisplayName("1.5.1. Найти наибольшую цифру натурального числа 86731")
    @Test
    public void testOneFiveOne1(){

        Assertions.assertEquals(8, Main1_5.main5_1(86731));
    }

    @DisplayName("1.5.1. Найти наибольшую цифру натурального отрицательнчисла 49367")
    @Test
    public void testOneFiveOne2(){

        Assertions.assertEquals(9, Main1_5.main5_1(-49367));
    }

    @DisplayName("1.5.1. Найти наибольшую цифру натурального числа 2222")
    @Test
    public void testOneFiveOne3(){

        Assertions.assertEquals(2, Main1_5.main5_1(2222));
    }

    @DisplayName("1.5.1. Найти наибольшую цифру натурального числа 0")
    @Test
    public void testOneFiveOne4(){

        Assertions.assertEquals(0, Main1_5.main5_1(0));
    }
    @DisplayName("1.5.2. Вероятность четных случайных чисел")
    @Test
    public void testOneFiveTwo(){

        if ( Main1_5.main5_2()>0 && Main1_5.main5_2()<100) {
            System.out.println("Вероятность четных случайных чисел в допустимом диапазоне");
        } else {
        System.err.println("Ошибка");
        }
        }
    @DisplayName("1.5.3. Посчитать четные и нечетные цифры числа 4863")
    @Test
    public void testOneFiveThree1(){
        Assertions.assertEquals(4, Main1_5.main5_3(4863));
    }

    @DisplayName("1.5.3. Посчитать четные и нечетные цифры числа 5744691")
    @Test
    public void testOneFiveThree2(){
        Assertions.assertEquals(7, Main1_5.main5_3(5744691));
    }

    @DisplayName("1.5.4. Ряд Фибоначчи, вывести 5 цифр")
    @Test
    public void testOneFiveFour1(){
        System.out.println(Main1_5.main5_4(5));
        Assertions.assertEquals("1 2 3 5 8", Main1_5.main5_4(5));
    }

    @DisplayName("1.5.4. Ряд Фибоначчи, вывести 6 цифр")
    @Test
    public void testOneFiveFour2(){
        System.out.println(Main1_5.main5_4(6));
        Assertions.assertEquals("1 2 3 5 8 13", Main1_5.main5_4(6));
    }
    @DisplayName("1.5.5. Вывести ряд чисел в диапазоне с шагом: min:5, max:15, step:3)")
    @Test
    public void testOneFiveFive1(){
        System.out.println(Main1_5.main5_5(5, 25, 3));
        Assertions.assertEquals("5 8 11 14 ", Main1_5.main5_5(5, 15, 3));
    }

    @DisplayName("1.5.5. Вывести ряд чисел в диапазоне с шагом: min:7, max:18, step:4")
    @Test
    public void testOneFiveFive2(){
        System.out.println(Main1_5.main5_5(7, 18, 4));
        Assertions.assertEquals("7 11 15 ", Main1_5.main5_5(7, 18, 4));
    }

    @DisplayName("1.5.5. Вывести ряд чисел в диапазоне с шагом: min:7, max:18, step:4")
    @Test
    public void testOneFiveSix1(){
        Assertions.assertEquals("12817", Main1_5.main5_6(71821));
    }


    }


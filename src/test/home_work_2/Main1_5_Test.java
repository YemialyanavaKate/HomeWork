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

    @DisplayName("1.5.1. Найти наибольшую цифру натурального числа 49367")
    @Test
    public void testOneFiveOne2(){

        Assertions.assertEquals(9, Main1_5.main5_1(49367));
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
    public void testOneFiveFour(){
       // Main1_5.main5_4(5);

        /*public static String main5_4(int f) {
        int f1 = 1;
        int f2 = 2;
        int b1;
        String text;
        System.out.printf("%d %d ", f1, f2);
        int[] array = new int[f];
        array[0] = f1;
        array[1] = f2;

        for (int i = 3; i <= f; i++) {
            array[i] = f1 + f2;
            System.out.print(f1 + f2 + " ");
            b1 = f1;
            f1 = f2;
            f2 = b1 + f1;
            text = Arrays.toString(array);
            System.out.println(text);
            System.out.print("\n");
        }
        return text;
    }*/
    }
    @DisplayName("1.5.5. Вывести ряд чисел в диапазоне с шагом")
    @Test
    public void testOneFiveFive(){
       // Main1_5.main5_5(5, 25, 3);
    }
    }


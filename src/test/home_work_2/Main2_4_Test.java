package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @DisplayName("2.4.3 Элементы массива, которые меньше среднего арифметического {1,2,3,4,0,2,2}")
    @Test
    public void testTwoFourThree() {
        int[] array = {1, 2, 3, 4, 0, 2, 2};
        Main2_4.main2_4_3(array);
    }
        //int[] arraySmall = {1,0};
        //Assertions.assertArrayEquals(arraySmall, Main2_4.main2_4_3(array));
        /*int sum = 0;
        double avrg;
        int[] minArray = new int[container.length];

        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            sum = sum + element;
        }
        avrg = sum * 1.0/ container.length;
        System.out.printf("Среднее арифметическое массива:%.2f\n ",avrg);
        System.out.print("Элементы массива, которые меньше среднего арифметческого:");

        int j = 0;
        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (element < avrg) {
                minArray[j] = element;
                j++;

                System.out.print(element + " ");
            }
        }
        System.out.println();
        return minArray;
    }*/
    }


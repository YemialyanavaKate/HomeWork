package test.home_work_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.home_work_2.utils.SortsUtilsNew;

import java.util.Arrays;

public class Main4_2_Test {

    @DisplayName("4.2.2.1 Сортировка массива {1, 2, 3, 4, 5, 6} пузырьковой сортировкой")
    @Test
    public void testFourTwoTwoOne1(){
        int[] array = {1,2,3,4,5,6};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortsUtilsNew.sort(array)));
    }

    @DisplayName("4.2.2.1 Сортировка массива {1, 2, 3, 4, 5, 6} шейкерной сортировкой")
    @Test
    public void testFourTwoTwoOne2(){
        int[] array = {1,2,3,4,5,6};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortsUtilsNew.shake(array)));
    }

    @DisplayName("4.2.2.2 Сортировка массива {1, 1, 1, 1} пузырьковой сортировкой")
    @Test
    public void testFourTwoTwoTwo1(){
        int[] array = {1, 1, 1, 1};
        Assertions.assertEquals("[1, 1, 1, 1]", Arrays.toString(SortsUtilsNew.sort(array)));
    }

    @DisplayName("4.2.2.2 Сортировка массива {1, 1, 1, 1} шейкерной сортировкой")
    @Test
    public void testFourTwoTwoTwo2(){
        int[] array = {1, 1, 1, 1};
        Assertions.assertEquals("[1, 1, 1, 1]", Arrays.toString(SortsUtilsNew.shake(array)));
    }

    @DisplayName("4.2.2.3 Сортировка массива {9, 1, 5, 99, 9, 9} пузырьковой сортировкой")
    @Test
    public void testFourTwoTwoThree1(){
        int[] array = {9, 1, 5, 99, 9, 9};
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(SortsUtilsNew.sort(array)));
    }

    @DisplayName("4.2.2.3 Сортировка массива {9, 1, 5, 99, 9, 9} шейкерной сортировкой")
    @Test
    public void testFourTwoTwoThree2(){
        int[] array = {9, 1, 5, 99, 9, 9};
        Assertions.assertEquals("[1, 5, 9, 9, 9, 99]", Arrays.toString(SortsUtilsNew.shake(array)));
    }

    @DisplayName("4.2.2.4 Сортировка массива {} пузырьковой сортировкой")
    @Test
    public void testFourTwoTwoFour1(){
        int[] array = {};
        Assertions.assertEquals("[]", Arrays.toString(SortsUtilsNew.sort(array)));
    }

    @DisplayName("4.2.2.4 Сортировка массива {} шейкерной сортировкой")
    @Test
    public void testFourTwoTwoFour2(){
        int[] array = {};
        Assertions.assertEquals("[]", Arrays.toString(SortsUtilsNew.shake(array)));
    }

    @DisplayName("4.2.2.5 Сортировка массива {6, 5, 4, 3, 2, 1} пузырьковой сортировкой")
    @Test
    public void testFourTwoTwoFive1(){
        int[] array = {6, 5, 4, 3, 2, 1};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortsUtilsNew.sort(array)));
    }

    @DisplayName("4.2.2.5 Сортировка массива {6, 5, 4, 3, 2, 1} шейкерной сортировкой")
    @Test
    public void testFourTwoTwoFive2(){
        int[] array = {6, 5, 4, 3, 2, 1};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(SortsUtilsNew.shake(array)));
    }

    @DisplayName("4.2.2.6 Сортировка массива {4, 5, 8, 1, 9, 2, 5} пузырьковой сортировкой")
    @Test
    public void testFourTwoTwoSix1(){
        int[] array = {4, 5, 8, 1, 9, 2, 5};
        Assertions.assertEquals("[1, 2, 4, 5, 5, 8, 9]", Arrays.toString(SortsUtilsNew.sort(array)));
    }

    @DisplayName("4.2.2.6 Сортировка массива {4, 5, 8, 1, 9, 2, 5} шейкерной сортировкой")
    @Test
    public void testFourTwoTwoSix2(){
        int[] array = {4, 5, 8, 1, 9, 2, 5};
        Assertions.assertEquals("[1, 2, 4, 5, 5, 8, 9]", Arrays.toString(SortsUtilsNew.shake(array)));
    }

    @DisplayName("4.2.2.7 Сортировка массива {0, 0, 0} пузырьковой сортировкой")
    @Test
    public void testFourTwoTwoSeven1(){
        int[] array = {0, 0, 0};
        Assertions.assertEquals("[0, 0, 0]", Arrays.toString(SortsUtilsNew.sort(array)));
    }

    @DisplayName("4.2.2.7 Сортировка массива {0, 0, 0} шейкерной сортировкой")
    @Test
    public void testFourTwoTwoSeven2(){
        int[] array = {0, 0, 0};
        Assertions.assertEquals("[0, 0, 0]", Arrays.toString(SortsUtilsNew.shake(array)));
    }
    }


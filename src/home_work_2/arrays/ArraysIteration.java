package home_work_2.arrays;

public class ArraysIteration {
    public static void main(String[] args) {

        main2_2_1();
        main2_2_2();
        main2_2_3();

    }

    static void main2_2_1() {
        int[] container = ArraysUtils.arrayFromConsole();

        System.out.println("Массив содержит элементы (цикл do while): ");
        int a = 0;
        do {
            System.out.print(container[a] + " ");
            a++;
        }
        while (a < container.length);
        System.out.println();

        System.out.println("Массив содержит элементы (цикл while): ");
        int b = 0;
        while (b < container.length) {
            System.out.print(container[b] + " ");
            b++;
        }

        System.out.println();

        System.out.println("Массив содержит элементы (цикл for): ");
        for (int i = 0; i < container.length; i++) {
            System.out.print(container[i] + " ");
        }
        System.out.println();

        System.out.println("Массив содержит элементы (цикл foreach): ");
        for (int j : container) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void main2_2_2() {
        int[] container = ArraysUtils.arrayFromConsole();

        int i = 1;
        do {
            int element2 = container[i];
            System.out.print(element2 + " ");
            i = i + 2;
        }
        while (i < container.length);
        System.out.println();

        i = 1;
        while (i < container.length) {
            int element2 = container[i];
            System.out.print(element2 + " ");
            i = i + 2;
        }
        System.out.println();

        for (int j = 1; j < container.length; j = j + 2) {
            int element3 = container[j];
            System.out.print(element3 + " ");
        }
        System.out.println();

    }

    static void main2_2_3() {
        int[] container = ArraysUtils.arrayFromConsole();

        System.out.println("Элементы массива наоборот (цикл do while): ");
        int k = 1;
        do {
            System.out.print(container[container.length-k] + " ");
            k++;
        }
        while (0 <= container.length - k);
        System.out.println();

        System.out.println("Элементы массива наоборот (цикл while): ");
        int l = 1;
        while (0 <= container.length - l) {
            System.out.print(container[container.length-l] + " ");
            l++;
        }
        System.out.println();

        System.out.println("Элементы массива наоборот (цикл for): ");
        for (int m = 1; 0 <= container.length - m; m++) {
            System.out.print(container[container.length - m] + " ");
        }
        System.out.println();

        System.out.println("Элементы массива наоборот (цикл foreach): ");
        for (int n : container) {
            System.out.print(container[container.length - n] + " ");
        }
        System.out.println();
    }
}

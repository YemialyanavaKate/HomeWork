package HomeWork1;

public class Task1New {
    public static void main(String[] args) {
        float x = 42.5f; // побитовые операторы могут быть примерены только к целочисленным типам
        int y = 16; // 00010000
        int z = (int) x; // выполним преобразование типов, чтобы иметь возможность применить побитовую операцию

        int resultAnd = z & y; // 00000000
        int resultOr = z | y; //00111010

        System.out.println("Результат побитового AND:" + resultAnd);
        System.out.println("Результат побитового OR:" + resultOr);
    }
}

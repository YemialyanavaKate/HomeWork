package presentations.sleep;

import java.util.concurrent.TimeUnit;

public class Sleep {
    public static void main(String[] args) {
        System.out.println("Засыпаю на 10 секунд");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Возобновляю работу через 5 секунд");
    }
}

package presentations.sleep;

import java.util.concurrent.TimeUnit;

public class spaceship {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Поехали");
    }
}

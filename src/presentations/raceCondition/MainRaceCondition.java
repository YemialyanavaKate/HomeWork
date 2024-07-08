package presentations.raceCondition;

public class MainRaceCondition {
    private static int schet=0;
    public static void main(String[] args) {
        Thread th1 = new Thread(() ->{
            for (int i = 0; i < 1_000; i++) {
                schet++;
            }
            Thread schetThread1 = Thread.currentThread();

            System.out.println(schetThread1.getName() + ": Мы закончили");
        });
        th1.setName("Добавление на счет");
        th1.start();

        Thread th2 = new Thread(() ->{
            for (int i = 0; i < 1_000; i++) {
                schet--;
            }
            Thread schetThread2 = Thread.currentThread();

            System.out.println(schetThread2.getName() + ": Мы закончили");
        });
        th2.setName("Снятие со счета");
        th2.start();

        System.out.println("Баланс: " + schet);
    }
}

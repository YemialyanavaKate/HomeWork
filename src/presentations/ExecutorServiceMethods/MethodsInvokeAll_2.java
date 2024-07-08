package presentations.ExecutorServiceMethods;

import java.util.List;
import java.util.concurrent.*;

public class MethodsInvokeAll_2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Создадим список Callable задач, возвращающих строку
        List<Callable<String>> tasks = List.of(
                () -> "Задача1 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача2 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача3 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача4 выполняется в потоке - " + Thread.currentThread().getName(),
                () -> "Задача5 выполняется в потоке - " + Thread.currentThread().getName()
        );

        /*
         *  Метод <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks);
         *  Параметр tasks - коллекция вызываемых Callable задач.
         *  Возвращает список Future после завершения выполнения всех переданных задач.
         */
        try {
            List<Future<String>> futureList = executorService.invokeAll(tasks);

            for (Future<String> future : futureList) {
                System.out.println(future.get());
            }

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }


        executorService.shutdown();
    }
}

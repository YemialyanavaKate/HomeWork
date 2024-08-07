package home_work_6.threads;

import home_work_6.threads.job.JobProduser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

// HomeWork\resources

public class MainThreads {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Напишите адресс папки для считывания файлов (для выхода 'quit')");
        String nameDir;
        File dir;
        do {
            nameDir = console.nextLine();
            if (nameDir.equals("quit")) {
                return;
            }
            dir =  choiceDir(nameDir);
        } while (!dir.exists());

        File[] files = dir.listFiles();

        Queue<File> queue = new LinkedList<>();
        assert files != null;
        for (File file : files) {
            queue.offer(file);
        }

        ExecutorService executor = Executors.newFixedThreadPool(31);

        List<Future<Long>> futures = new ArrayList<>();

        long result = 0;
        String word = null;
        do {
            try (FileWriter writer = new FileWriter("ResultSearch.txt", true)){
                do {
                    System.out.println("\nКакое слово будем искать в этих фаилах? (для выхода 'quit')");
                    word = console.nextLine();
                    for (File file : queue) {
                        Callable<Long> job = new JobProduser(file, word);
                        Future<Long> future = executor.submit(job);

                        futures.add(future);
                    }
                    /*try {
                        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                        //Ожидание завершения всех задач - awaitTermination используется для
                        // ожидания завершения всех задач перед записью результатов в файл.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/

                    List<File> lst = null;
                    File[] arrFiles = dir.listFiles();
                     if (arrFiles != null){
                         lst = Arrays.asList(arrFiles);
                     }

                    int i = 0;

                    for (Future<Long> future : futures) {
                         result = future.get();
                        if (!(word.equalsIgnoreCase("quit"))) {
                            assert lst != null;
                            writer.write(lst.get(i).toString().substring(nameDir.length() + 1) + " - " + word + " - " + result + "\n");
                            i = i + 1;
                        }
                    }

                }
                while (!(word.equalsIgnoreCase("quit")));
                writer.flush();
                executor.shutdown();
            } catch (FileNotFoundException e){
                System.out.println("Нет такого фаила");
            } catch (IOException e) {
                System.out.println("Ошибка чтения фаила");
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (!(word.equalsIgnoreCase("quit")));

        System.out.println("Результаты поиска в фаиле ResultSearch.txt");
    }

    /**
     * Метод, который создает объект каталога
     * @param nameDir адресс папки (вводится пользователем)
     * @return объект каталога
     */
    public static File choiceDir(String nameDir) {
        File dir;
        dir = new File(nameDir);
        if (!dir.isDirectory()) {
            System.out.println("Нужно передать путь к папке для чтения фаилов");
        }
        return dir;
    }
}


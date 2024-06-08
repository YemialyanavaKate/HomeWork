package home_work_6.threads;

import home_work_6.dto.EasySearchNew;
import home_work_6.threads.job.JobProduser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.*;
// D:\IT\ProgectJava\Course\IT-Group\HomeWork\src\home_work_6\library

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
                    for (Future<Long> future : futures) {
                        try {
                            result += future.get();
                            if (!(word.equals("quit") || word.equals("file"))) {
                                writer.write(queue.peek() + " - " + word + " - " + result + "\n");
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                while (!(word.equals("quit")));
                writer.flush();
            } catch (FileNotFoundException e){
                System.out.println("Нет такого фаила");
            } catch (IOException e) {
                System.out.println("Ошибка чтения фаила");
            }
        } while (!(word.equals("quit")));

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
            throw new IllegalArgumentException("Нужно передать путь к папке для чтения фаилов");
        }
        return dir;
    }
}


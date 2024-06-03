package home_work_6.threads;

import home_work_6.dto.EasySearchNew;
import home_work_6.threads.job.JobSearch;

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

        String word = null;

        List<File> files = List.of(Objects.requireNonNull(dir.listFiles()));

        ExecutorService executor = Executors.newSingleThreadExecutor();

        List<Future<Long>> futures = new ArrayList<>();
        for (File file : files) {
            Callable<Long> job = new JobSearch(file);
            Future<Long> future = executor.submit(job);

            futures.add(future);
        }

        long result = 0;

        for (Future<Long> future : futures) {
            try {
                result += future.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Всего найдено слов " + result);


            /*try (FileWriter writer = new FileWriter("ResultSearch.txt", true)){
                    String text = Files.readString(Path.of(addressFile));
                    EasySearchNew searchEngine = new EasySearchNew();

                    do {
                        System.out.println("\nКакое слово будем искать в тексте? (для выхода 'quit', для выбора другого фаила 'file')");
                        word = console.nextLine();
                        long count = searchEngine.search(text, word);
                        if (!(word.equals("quit") || word.equals("file"))) {
                            writer.write(nameFileRead + " - " + word + " - " + count + "\n");
                        }
                    }
                    while (!(word.equals("quit") || word.equals("file")));

                writer.flush();
            } catch (FileNotFoundException e){
                System.out.println("Нет такого фаила");
            } catch (IOException e) {
                System.out.println("Ошибка чтения фаила");
            }*/
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


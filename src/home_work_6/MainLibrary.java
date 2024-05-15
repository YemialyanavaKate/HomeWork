package home_work_6;

import home_work_6.dto.EasySearchNew;
import home_work_6.dto.RegExSearch;
import home_work_6.dto.SearchEnginePunctuationNormalizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// D:\IT\ProgectJava\Course\IT-Group\HomeWork\src\home_work_6\library

public class MainLibrary {
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

        printListFile(dir, nameDir);

        String word = null;
        do {
        System.out.println("\nВыберите фаил для считывания (для выхода 'quit')");
        String nameFileRead = console.nextLine();
        if(nameFileRead.equals("quit")){
            return;
        }
        String addressFile= nameDir + "\\" + nameFileRead;

            try (FileWriter writer = new FileWriter("ResultSearch.txt", true)){
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
            }
        } while (word.equals("file"));
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
        if (!dir.exists()) {
            System.out.println("Введите корректный путь");
        }
        return dir;
    }

    /**
     * Метод, который выводит в консоль список фаилов в каталоге
     * @param dir объект каталога
     * @param nameDir адресс папки (вводится пользователем)
     */
    public static void printListFile (File dir,String nameDir){
            List<File> lst;
            File[] arrFiles = dir.listFiles();
            if (arrFiles != null){
                lst = Arrays.asList(arrFiles);

                for (File nameFile : lst) {
                    int indexStart = nameDir.length() + 1;
                    int indexStop = nameFile.toString().length();
                    System.out.println(nameFile.toString().substring(indexStart, indexStop));
                }
            }
        }
    }


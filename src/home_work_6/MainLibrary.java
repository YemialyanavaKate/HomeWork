package home_work_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите фаил для считывания (для выхода 'quit')";
        String nameFile = console.nextLine();
        if(nameFile.equals("quit")){
            return;
        }
        File file = new File(nameFile);
        if (!file.exists()) {
            System.out.println("Введите корректный путь");
            return;
        }
        try{
            FileReader reader = new FileReader(file);

        } catch (FileNotFoundException e){
            System.out.println("Нет такого фаила");
        } catch (IOException e) {
            System.out.println("Ошибка чтения фаила");
        }
    }
}

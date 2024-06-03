package control2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainConsole {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите адрес для чтения чтения списка песен");
        String path = console.nextLine();

        File file = new File(path);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

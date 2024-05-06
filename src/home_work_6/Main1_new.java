package home_work_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main1_new {
    public static void main(String[] args) {
        Set<String> setWords = new  HashSet<>();

        try (FileReader reader = new FileReader("Война и мир_книга.txt");
             BufferedReader buf = new BufferedReader(reader)
        ){
            String line;
            String str;
            String[] words;

            StringBuilder builder = new StringBuilder();
            while ((line = buf.readLine()) != null){
                builder.append(line);
            }
            str = builder.toString();
            words = str.split(" ");
            for (int i = 0; i <words.length - 1 ; i++) {
                setWords.add(words[i]);

            }

        }catch (IOException e) {
            System.out.println("Ошибка записи");
        }
        System.out.println(setWords.size());

        for (String setWord : setWords) {
            System.out.println(setWord);
        }

    }
}

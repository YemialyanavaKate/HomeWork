package home_work_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main2_new {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        try (FileReader reader = new FileReader("Война и мир_книга.txt");
             BufferedReader buf = new BufferedReader(reader)
        ){
            String line;
            String str;
            String[] words;

            StringBuilder builder = new StringBuilder();
            while ((line = buf.readLine()) != null) {
                builder.append(line);
            }
            str = builder.toString();
            str = str.replaceAll("\\p{Punct}", "");
            str = str.replaceAll(" {2}", " ");
            str = str.replaceAll("\\s+", " ");
            words = str.split(" ");
            int count = 1;

            for (int i = 0; i < words.length - 1; i++) {
                    if (words[i] != " " && !map.containsKey(words[i])){
                        map.put(words[i],count);
                    } else if (words[i] != " ") {
                        int countWord = map.get(words[i]);
                        countWord++;
                        map.put(words[i],countWord);
                    }
                }

        }catch (IOException e) {
            System.out.println("Ошибка записи");
        }

        List <Map.Entry<String, Integer>> valuesList = new ArrayList(map.entrySet());
        valuesList.remove(null);

        Collections.sort(valuesList, new Comparator<Map.Entry<String, Integer>>() {

        @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
            return o1.getValue().compareTo(o2.getValue());
        }
        });
        valuesList.size();
        for (int i = valuesList.size() - 1; i > valuesList.size() - 11; i--) {

            System.out.println(valuesList.get(i));
        }

    }
}

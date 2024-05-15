package home_work_6;

import home_work_6.dto.EasySearch;
import home_work_6.dto.RegExSearch;
import home_work_6.dto.SearchEnginePunctuationNormalizer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainSearch {

    public static void main(String[] args) {
        String str;
        try (FileReader reader = new FileReader("Война и мир_книга.txt");
             BufferedReader buf = new BufferedReader(reader)
        ){
            String line;

            String war = "война";
            String and = " и ";
            String peace = "мир";

            StringBuilder builder = new StringBuilder();
            while ((line = buf.readLine()) != null) {
                builder.append(line);
            }
            str = builder.toString();

            EasySearch counter1 = new EasySearch();
            long x1 = counter1.search(str, war);
            long y1 = counter1.search(str, and);
            long z1 = counter1.search(str, peace);

            System.out.println("EasySearch посчитал:");
            print(war, x1);
            print(and, y1);
            print(peace, z1);

            RegExSearch counter2 = new RegExSearch();
            long x2 = counter2.search(str, war);
            long y2 = counter2.search(str, and);
            long z2 = counter2.search(str, peace);

            System.out.println("RegExSearch посчитал:");
            print(war, x2);
            print(and, y2);
            print(peace, z2);

            SearchEnginePunctuationNormalizer counter3 = new SearchEnginePunctuationNormalizer(new RegExSearch());
            long x3 = counter3.search(str, war);
            long y3 = counter3.search(str, and);
            long z3 = counter3.search(str, peace);

            System.out.println("SearchEnginePunctuationNormalizer посчитал:");
            print(war, x3);
            print(and, y3);
            print(peace, z3);



        }catch (IOException e) {
            System.out.println("Ошибка записи");
        }

    }
    static void print(String word, long x){
        System.out.println("Слово \"" + word + "\" встречается " + x + " раз");
    }
}

package home_work_6.dto;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int counter = 0;
        if (word.isEmpty()){
            return -1;
        }
        try {
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                counter++;
            }
            return counter;
        } catch (PatternSyntaxException pse){
            return -1;
        }

    }
}

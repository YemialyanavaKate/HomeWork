package home_work_6.dto;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int index = 0;
        int counter = 0;
        if (word.isEmpty()){
            return -1;
        }

         while (index < text.length() && index != -1) {
            index = text.indexOf(word, index);
            if (index == -1 && counter == 0){
                //System.out.println("В тексте нет такого слова");
                return -1;
            } else
                if (index == -1){
                    return counter;
                }
            index = index + word.length() + 1;
            counter++;
        }
        return counter;
    }
}

package home_work_6.dto;

import home_work_6.api.ISearchEngine;

public class EasySearchNew implements ISearchEngine {
    private final static char[] splitChar = {
            ' ', '\n', ',', '.', '-', '!', '?'
    };
    @Override
    public long search(String text, String word) {
        int textLength = text.length();
        int wordLength = word.length();
        
        int indexWord = 0;
        int count = 0;
        if (word.isEmpty()){
            return -1;
        }

         while (indexWord < text.length() && indexWord != -1) {
             indexWord = text.indexOf(word, indexWord);

             int indexNextCharAfterWord = indexWord + wordLength;

             boolean needCheckBefore = indexWord > 0;
             boolean needCheckAfter = indexNextCharAfterWord < textLength;

             boolean charBeforeIsSplit = true;
             boolean charAfterIsSplit = true;

             if(needCheckBefore){
                 charBeforeIsSplit = isSplitChar2(text.charAt(indexWord - 1));
             }
             if(needCheckAfter){
                 charAfterIsSplit = isSplitChar2(text.charAt(indexNextCharAfterWord));
             }

             if(charBeforeIsSplit && charAfterIsSplit){
                 count++;
             }

            if (indexWord == -1 && count == 0){
                
                return -1;
            } else
                if (indexWord == -1){
                    return count;
                }
            indexWord = indexWord + word.length() + 1;
        }
        return count;
    }
    public boolean isSplitChar2(char ch){
        for (char split : splitChar) {
            if (split == ch){
                return true;
            }
        }
        return false;
    }
}

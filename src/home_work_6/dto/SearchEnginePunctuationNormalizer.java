package home_work_6.dto;

import home_work_6.api.ISearchEngine;

import java.util.regex.PatternSyntaxException;

public class  SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    public SearchEnginePunctuationNormalizer (ISearchEngine searchEngine){
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = optimalText(text);
        return searchEngine.search(text, word);
    }

    /**
     * Удаление нежелательных символов из текста:
     * удаление любых знаков препинания, лишних пробелов,
     * переводов строк
     * @param text текст, который нужно обработать,
     * @return textNew итоговый текст без нежелательных символов
     */
    public String optimalText (String text){
        String textNew = "";
            for (int i = 0; i < text.length(); i++) {
                if ((i = text.indexOf(", ")) > 0) {
                    textNew = text.replaceAll("\\p{Punct}", "");
                    textNew = textNew.replaceAll(" {2}", " ");
                    textNew = textNew.replaceAll("\n", " ");
                    return textNew;
                }
            }
        return textNew;
    }
}

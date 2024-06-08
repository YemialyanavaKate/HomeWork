package home_work_6.threads.job;

import home_work_6.dto.RegExSearch;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

public class JobProduser implements Callable<Long> {
    private final File file;
    private final String word;

    public JobProduser(File file, String word) {
        this.file = file;
        this.word = word;
    }

    @Override
    public Long call() throws Exception {
        String text = Files.readString(Path.of(file.toString()));
        RegExSearch regExSearch = new RegExSearch();

        Long count = regExSearch.search(text, word);
        return count;
    }
}

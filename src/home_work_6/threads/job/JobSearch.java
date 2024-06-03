package home_work_6.threads.job;

import java.io.File;
import java.util.concurrent.Callable;

public class JobSearch implements Callable {
    private final File file;

    public JobSearch(File file) {
        this.file = file;
    }

    @Override
    public Long call() throws Exception {
        return 0L;
    }
}

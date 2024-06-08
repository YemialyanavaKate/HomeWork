package home_work_6.threads.job;

import java.io.File;
import java.util.Queue;
import java.util.concurrent.Callable;

public class JobConsumer implements Callable<File> {
    private final Queue<File> queue;

    public JobConsumer(Queue<File> queue){
        this.queue = queue;
    }

    @Override
    public File call() throws Exception {
        return null;
    }
}

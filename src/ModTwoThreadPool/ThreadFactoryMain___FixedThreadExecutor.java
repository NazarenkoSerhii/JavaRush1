package ModTwoThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryMain___FixedThreadExecutor {
    public static void main(String[] args) {
       ThreadFactory customThreadFactory  = new CustomThreadFactory();

        ExecutorService service = Executors.newFixedThreadPool(10,customThreadFactory);
        for (int i=0;i<10;i++){
            service.execute(new Task(i));
        }

    }
}

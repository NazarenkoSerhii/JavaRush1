package ModTwoThreadPool;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorMain {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<Runnable> deque = new LinkedBlockingDeque<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, deque);

        for (int i=0;i<50;i++){
            threadPoolExecutor.execute(new Task(i));
        }

        threadPoolExecutor.shutdown();
        System.out.println("End");
    }
}

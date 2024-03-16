package ModTwoThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomMain {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i=0;i<20;i++){
            service.execute(new ThreadLocalRandomTask());
        }

    }

    static class ThreadLocalRandomTask implements Runnable{

        @Override
        public void run() {
            int i = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

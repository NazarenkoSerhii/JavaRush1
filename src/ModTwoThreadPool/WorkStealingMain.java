package ModTwoThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WorkStealingMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newWorkStealingPool(1000);
        for (int i=0;i<10;i++){
            service.execute(new Task(i));
        }
        service.awaitTermination(5, TimeUnit.SECONDS);
    }
}

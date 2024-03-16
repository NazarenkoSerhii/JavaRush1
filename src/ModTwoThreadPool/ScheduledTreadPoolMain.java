package ModTwoThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledTreadPoolMain {                  //планировщик потоков
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
  //задача начнется через N delay second/minute/hours/days
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Task(1), 5, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        Thread.sleep(9000);
        System.out.println(schedule.isDone());
    }
}

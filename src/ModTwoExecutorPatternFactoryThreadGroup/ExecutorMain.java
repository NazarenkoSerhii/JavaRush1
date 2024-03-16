package ModTwoExecutorPatternFactoryThreadGroup;

import java.util.Random;
import java.util.concurrent.*;

public class ExecutorMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> c = ()->{                                 //anon class + lyambda
            Thread.sleep(2000);
            return new Random().nextInt(7);
        };
        Runnable r = ()->{

            System.out.println("Hello....");
        };
        Future<?> futureRunnable = service.submit(r);

        Future<Integer> futureCallable= service.submit(c);
        service.shutdown();                                      // завершает все потоки
        System.out.println(futureCallable.get());
        System.out.println(futureRunnable.get());
    }
}

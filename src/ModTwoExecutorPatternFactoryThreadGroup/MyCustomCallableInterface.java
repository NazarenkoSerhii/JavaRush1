package ModTwoExecutorPatternFactoryThreadGroup;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCustomCallableInterface implements Callable<Integer> {    //  Runnable - void
                                                                // Callable - return . Является блокирующим
    @Override
    public Integer call() throws Exception {
        System.out.println("Start...");
        Thread.sleep(1000);
        Random random = new Random();
        return random.nextInt(7);
    }
}

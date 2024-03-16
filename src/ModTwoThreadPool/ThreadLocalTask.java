package ModTwoThreadPool;

import java.util.Random;

public class ThreadLocalTask implements Runnable{
    private ThreadLocal<Integer> threadLocal;

    public ThreadLocalTask(ThreadLocal<Integer> threadLocal) {
        this.threadLocal = threadLocal;
    }

    @Override
    public void run() {
        int randomNumber = new Random().nextInt(10);
        threadLocal.set(randomNumber);
        System.out.println(Thread.currentThread().getName()+" : " + threadLocal.get());
    }
}

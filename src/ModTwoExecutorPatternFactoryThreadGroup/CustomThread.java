package ModTwoExecutorPatternFactoryThreadGroup;

public class CustomThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread());
        }
    }
}

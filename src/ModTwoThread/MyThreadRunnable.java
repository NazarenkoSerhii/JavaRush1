package ModTwoThread;

public class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My RunnableThread...");
    }
}

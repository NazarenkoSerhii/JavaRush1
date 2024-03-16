package ModTwoThread;

public class MyThreadRunnableTwo implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        int count= 0;
        while (!thread.isInterrupted()){                           // проверка - не прерван ли поток
            System.out.println(++count + "My Thread222....");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

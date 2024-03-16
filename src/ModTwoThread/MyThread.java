package ModTwoThread;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(String.format("%s started ",getName()));
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("Finished %s ", getName()));

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();    // новый поток в потоке // интерфейс runnable
        Thread myRunnableThread = new Thread(myThreadRunnable);
        myRunnableThread.start();
    }
}

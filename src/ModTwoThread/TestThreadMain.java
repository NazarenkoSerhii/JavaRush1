package ModTwoThread;

public class TestThreadMain {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread("TestThread1");         // extends Thread
        testThread.start();

        // implement Runnable
        TestThreadRunnable testThreadRunnable = new TestThreadRunnable("TestThreadRunnable1");
        Thread thread = new Thread(testThreadRunnable);
        thread.start();

        // variant 1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Start ....Hello from Lyambda11111");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Finish.....Hello from Lyambda11111");
            }
        };
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();
        // variant 2
        Runnable runnable2 = () -> {
            System.out.println("Start ....Hello from Lyambda22222");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finish.....Hello from Lyambda22222");
        };
        Thread runnableThread2 = new Thread(runnable2);
        runnableThread2.start();

        Runnable runnable3 = () -> {
            Thread current = Thread.currentThread();
            try {
                System.out.println("Start ....Hello from Lyambda33333");
                while (!current.isInterrupted()) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                current.interrupt();
            }
            System.out.println("Hello");
        };
        Thread runnableThread3 = new Thread(runnable3);
        runnableThread3.start();
        Thread.sleep(10000);
        runnableThread3.interrupt();

    }
}

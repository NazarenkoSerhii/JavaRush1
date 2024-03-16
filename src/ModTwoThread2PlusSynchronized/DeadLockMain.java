package ModTwoThread2PlusSynchronized;

public class DeadLockMain {
    private final static Object lock1 = new Object();
    private final static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 - lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (lock2) {
                System.out.println("Thread1 - lock2");
            }

        }
        );
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2 - lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            synchronized (lock1) {
                System.out.println("Thread2 - lock1");
            }

        }
        );
        thread.start();
        thread2.start();
    }
}

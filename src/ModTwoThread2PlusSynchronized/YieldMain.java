package ModTwoThread2PlusSynchronized;

public class YieldMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(
                ()->{
                    for (int i=0;i<10;i++){
                        System.out.println("Thread 1 : " + i );
                        Thread.yield();
                    }
                }
        );
        Thread thread2 = new Thread(
                ()->{
                    for (int i=0;i<10;i++){
                        System.out.println("Thread 2 : " + i );
                        Thread.yield();
                    }
                }
        );
        System.out.println("start...");
        thread.start();
        thread2.start();

        System.out.println("waiting for finish...");
        thread.join();
        thread2.join();

        System.out.println("End");
    }
}

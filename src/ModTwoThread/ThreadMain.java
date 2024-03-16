package ModTwoThread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main");
        MyThread myThread = new MyThread("My Thread 1");
        myThread.start();                     //  start - запуск потока, run - для описывания логики потока
        MyThread myThread2 = new MyThread("My Thread 2");
        myThread2.start();


        // вариант 1
        Runnable r = () -> System.out.println("Hello from Lyambda...");
        Thread threadLyambda = new Thread(r);
        threadLyambda.start();

        // вапиант 2 (укороченный)
        new Thread(() -> System.out.println("Hello from Lyambda2...")).start();

        // вапиант 3
        Runnable r2 = () -> {
            System.out.println("First....");
            System.out.println("Second....");
        };
        Thread thread3 = new Thread(r2);
        thread3.start();

        //
        MyThreadRunnableTwo myThreadRunnableTwo = new MyThreadRunnableTwo();
        Thread MyTwothread = new Thread(myThreadRunnableTwo);
        MyTwothread.start();
        Thread.sleep(4000);
        System.out.println("End Main");
        MyTwothread.interrupt();                                       // поток прерван

    }
}

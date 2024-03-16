package ModTwoThread2PlusSynchronized;

public class MainCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        VolatileCounter volatileCounter = new VolatileCounter();

        ThreadCounter threadCounter = new ThreadCounter(counter);         // variant 1 длинная форма записи
        Thread thread = new Thread(threadCounter);
        thread.start();

        new Thread(new ThreadCounter(counter)).start();               // variant 2 короткая форма записи
        thread.join();                                                // join останавливает главный поток Main,до тех пор
                                                                      // пока не закончит работу Thread1
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.getCount());
        System.out.println("============================");

        Thread thread1 = new Thread(new VolatileCounterThread(volatileCounter));
        Thread thread2 = new Thread(new VolatileCounterThread(volatileCounter));

        System.out.println("Thread 1  start ....");
        thread1.start();

        try {
            thread1.join();                               // join останавливает главный поток Main,до тех пор
        } catch (InterruptedException e) {                // пока не закончит работу Thread1
            throw new RuntimeException(e);
        }
        System.out.println(volatileCounter.getCount() + " Temp count ");

        System.out.println("Thread 2  start ....");
        thread2.start();
        try {
            thread2.join();                               // join останавливает главный поток Main,до тех пор
        } catch (InterruptedException e) {                // пока не закончит работу Thread2
            throw new RuntimeException(e);
        }
        System.out.println(volatileCounter.getCount() + " Final count ");
//        System.out.println(volatileCounter.getCount());
    }
}

package ModTwoExecutorPatternFactoryThreadGroup;

public class ThreadGroupMain {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Group1");                       // группа потоков

        CustomThread customThread = new CustomThread();
        Thread thread1 = new Thread(group, customThread, "My Thread 1");    // var 1    long

        Thread thread2 = new Thread(group, new CustomThread(), "My Thread 2");     // var 2     short
        Thread thread3 = new Thread(group, new CustomThread(), "My Thread 3");
        Thread thread4 = new Thread(group, new CustomThread(), "My Thread 4");

        thread1.setPriority(1);                                                     // приоритет потока
        thread2.setPriority(1);                                                     // приоритет потока
        thread3.setPriority(1);                                                     // приоритет потока
        thread4.setPriority(10);                                                     // приоритет потока

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        group.list();                                      //выводит все потоки

        Thread.sleep(300);                            // усыпляет главный поток Main
        group.interrupt();                                 // останавливает все потоки
        System.out.println("End");
    }
}

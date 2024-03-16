package ModTwoThread2PlusSynchronized;

public class Counter {
    private int count = 0;

    public  void increment() {                                  // synchronized - пока метод не отработает до конца
       synchronized (this){count++;}                                       // следующий поток его не вызовет

//        System.out.println(Thread.currentThread() + "Used...");      // sout не synchronized
    }


    public int getCount() {
        return count;
    }
}

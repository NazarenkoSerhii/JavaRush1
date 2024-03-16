package ModTwoThread2PlusSynchronized;

public class VolatileCounter {
                                             // volatile  -  волатайл сразу созраняется в общий heap, а не в отдельный,
                                             // выделенный для потока
                                             // для каждого потока Thread выделяется отдельный(локальный) Heap
    private volatile int count=0;
    public void incrementVolotile(){
        count++;
//        System.out.println(Thread.currentThread() + "Used...");
    }

    public int getCount() {
        return count;
    }
}

package ModTwoThread2PlusSynchronized;

public class ThreadCounter implements Runnable {

    private Counter counter;

    public ThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
            counter.increment();
        }
           }
}

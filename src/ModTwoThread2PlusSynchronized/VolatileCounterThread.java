package ModTwoThread2PlusSynchronized;

public class VolatileCounterThread implements Runnable{
    private VolatileCounter volatileCounter;
//    VolatileCounter volatileCounter = new VolatileCounter();

    public VolatileCounterThread(VolatileCounter volatileCounter) {
        this.volatileCounter = volatileCounter;
    }

    @Override
    public void run() {
        for (int i =0;i<100_000;i++){
            volatileCounter.incrementVolotile();
        }
    }
}

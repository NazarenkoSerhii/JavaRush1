package ModTwoThread;

public class TestThread extends Thread{
    public TestThread(String name) {                    //конструктор
        super(name);
    }

    @Override
    public void run() {
        System.out.println(String.format("Started %s",getName()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("Finished %s",getName()));
    }
}

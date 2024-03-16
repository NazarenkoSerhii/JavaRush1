package ModTwoThread;

public class TestThreadRunnable implements Runnable{
    private String name;

    public TestThreadRunnable(String name) {               // constructor
        this.name = name;
    }

    public String getName() {                              // getter
        return name;
    }

    public void setName(String name) {                    // setter
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(String.format("Start %s",getName()));

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(String.format("Finish %s",getName()));
    }
}

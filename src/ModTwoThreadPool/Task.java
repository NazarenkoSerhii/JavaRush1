package ModTwoThreadPool;

public class Task implements Runnable{
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task with id "+ id + " running : " + Thread.currentThread().getName());
        int counter =0;
        for (int i=0;i<5;i++){

            counter++;
        }
        System.out.println(counter);
    }
}

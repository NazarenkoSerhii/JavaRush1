package ModTwoThreadPool;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorMain {
    public static void main(String[] args) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            newSingleThreadExecutor.execute(new Task(i));
        }
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals("1")){
            newSingleThreadExecutor.execute(new Task(100));
        }

        newSingleThreadExecutor.shutdown();

    }
}

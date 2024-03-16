package ModTwoThreadPool;

public class ThreadLocalMain {                // Используется для хранения локальных переменных
    public static void main(String[] args) {
        ThreadLocal<Integer> threadLocalTask= new ThreadLocal();
        new Thread(new ThreadLocalTask(threadLocalTask)).start();
        new Thread(new ThreadLocalTask(threadLocalTask)).start();

    }
}

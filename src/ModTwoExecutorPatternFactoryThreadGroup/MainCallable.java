package ModTwoExecutorPatternFactoryThreadGroup;

public class MainCallable {
    public static void main(String[] args) throws Exception {
        MyCustomCallableInterface myCustomCallableInterface = new MyCustomCallableInterface();
        Integer call = myCustomCallableInterface.call();

        System.out.println("Main is in progress...");

        System.out.println(call);                        // пока не вернется call, дальнейшее выполнение блокируется

        System.out.println("Main is done...");
    }
}

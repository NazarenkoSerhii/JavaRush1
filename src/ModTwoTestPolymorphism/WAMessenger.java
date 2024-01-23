package ModTwoTestPolymorphism;

public class WAMessenger extends Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Send via WA");
    }
}

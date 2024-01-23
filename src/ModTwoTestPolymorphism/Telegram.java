package ModTwoTestPolymorphism;

public class Telegram extends Messenger{
    @Override
    public void sendMessage() {
        System.out.println("Send via telegram");
    }
}

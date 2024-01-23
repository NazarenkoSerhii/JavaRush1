package ModTwoTestPolymorphism;

public class EmailMessenger extends Messenger{
    @Override
    public void sendMessage() {
        System.out.println("send via email");
    }
}

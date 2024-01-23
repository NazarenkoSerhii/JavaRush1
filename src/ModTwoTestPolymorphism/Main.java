package ModTwoTestPolymorphism;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("John",new EmailMessenger()));
        userList.add(new User("Jack",new Telegram()));
        userList.add(new User("Max",new WAMessenger()));


        userList.get(0).setMessenger(new Telegram());                 //Zamena email na telegram


        for (User u:userList){
            u.getMessenger().sendMessage();                           // Abstraksia + Polymorphism
        }
    }
}

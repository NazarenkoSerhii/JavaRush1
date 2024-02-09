package ModTwoOOPPrimerMenuConsole.menu;

import ModTwoOOPPrimerMenuConsole.service.UserService;

import java.util.Scanner;

public abstract class MenuItem {

    protected UserService userService=new UserService(); // HAS A
    protected Scanner scanner = new Scanner(System.in);
    public abstract void action();
}

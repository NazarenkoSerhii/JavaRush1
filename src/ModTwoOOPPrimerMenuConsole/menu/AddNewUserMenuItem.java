package ModTwoOOPPrimerMenuConsole.menu;

import ModTwoOOPPrimerMenuConsole.model.User;

public class AddNewUserMenuItem extends MenuItem{
    @Override
    public void action() {
        System.out.println("type user name: ");
        String userName = scanner.nextLine();
        userService.addNewUser(new User(userName));

    }
}

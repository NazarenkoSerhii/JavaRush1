package ModTwoOOPPrimerMenuConsole.menu;

public class GetAllUsersMenuItem extends MenuItem {
    @Override
    public void action() {
        System.out.println("All users:");
        userService.getAllUsers();
    }
}

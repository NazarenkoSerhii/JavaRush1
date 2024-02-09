package ModTwoOOPPrimerMenuConsole.menu;

public class DeleteUserByIdMenuItem extends MenuItem{
    @Override
    public void action() {
        System.out.println("type user id: ");
        int userId = scanner.nextInt();
        userService.deleteUserById(userId);
    }
}

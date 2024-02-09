package ModTwoOOPPrimerMenuConsole.menu;

public class GetUserByIdMenuItem extends MenuItem{
    @Override
    public void action() {
        System.out.println("type user Id : ");
        int userId = scanner.nextInt();
        userService.deleteUserById(userId);
    }
}

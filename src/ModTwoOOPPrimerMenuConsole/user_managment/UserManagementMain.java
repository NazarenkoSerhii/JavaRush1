package ModTwoOOPPrimerMenuConsole.user_managment;

import ModTwoOOPPrimerMenuConsole.exception.InvalidUserArgumentException;
import ModTwoOOPPrimerMenuConsole.menu.Menu;

import java.util.Scanner;

public class UserManagementMain {
    public static final String MENU_INFO = """
                      Hello!
                      1 - Get all users
                      2 - Add new user
                      3 - Delete user by id
                      4 - Ger user by id
                      0 - Exit
            """;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println(MENU_INFO);
            int userInput = scanner.nextInt();
            userInputValidation(userInput);
            if (userInput == 0) {
                isRunning = false;
                System.out.println("Bye");
            } else {
                new Menu().run(userInput);
            }
        }
    }

    private static void userInputValidation(int userInput) {
        if (userInput >= 5 || userInput < 0) {
            throw new InvalidUserArgumentException(
                    String.format("%d is out of the score", userInput));
        }
    }
}

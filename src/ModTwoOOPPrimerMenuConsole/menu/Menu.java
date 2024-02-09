package ModTwoOOPPrimerMenuConsole.menu;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<Integer, MenuItem> items =
                    Map.of(1, new GetAllUsersMenuItem(),
                            2, new AddNewUserMenuItem(),
                            3, new DeleteUserByIdMenuItem(),
                            4, new GetUserByIdMenuItem());

    public void run(int item) {
        MenuItem menuItem = items.get(item);
        menuItem.action();

    }
}

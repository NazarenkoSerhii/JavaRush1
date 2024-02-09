package ModTwoOOPPrimerMenuConsole.dataStore;

import ModTwoOOPPrimerMenuConsole.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDB {                                                // DB - Data Base
    private static Map<Integer, User> users = new HashMap<>();
    private static int idCounter = 0;

    public Map<Integer, User> getAll() {
        return users;
    }

    public void add(User user) {
        users.put(++idCounter, user);
    }

    public void deleteById(int id) {
        users.remove(id);
    }

    public User getById(int id) {
        return users.get(id);
    }

}

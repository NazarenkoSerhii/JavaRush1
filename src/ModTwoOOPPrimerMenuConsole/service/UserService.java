package ModTwoOOPPrimerMenuConsole.service;

import ModTwoOOPPrimerMenuConsole.dataStore.UserDB;
import ModTwoOOPPrimerMenuConsole.model.User;

public class UserService {

    UserDB userDB = new UserDB();

    public void getAllUsers() {
        System.out.println(userDB.getAll());
    }

    public void addNewUser(User user) {
        userDB.add(user);
    }

    public void deleteUserById(int userId) {
        if (userDB.getById(userId) == null) {
            System.out.println("User by id not found!");
        }else {
            userDB.deleteById(userId);
        }
    }

    public void getUserById(int userId) {
        System.out.println(userDB.getById(userId));
    }
}

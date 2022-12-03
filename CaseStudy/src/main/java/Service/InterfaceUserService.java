package Service;

import Model.User;

import java.util.List;

public interface InterfaceUserService {
    List<User> showUserView ();
    User adminLogin (String username, String password);
    User userLogin (String username, String password);
    void updateUser();
    void addUser ();
    void removeUser ();
    boolean checkExistByID (long id);
    User findUserByID (long id);
}

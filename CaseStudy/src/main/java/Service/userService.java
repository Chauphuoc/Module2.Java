package Service;

import Model.Role;
import Model.User;

import java.util.List;

public class userService implements InterfaceUserService {

    @Override
    public List<User> showUserView() {
        return null;
    }


    @Override
    public User adminLogin(String username, String password) {
        List<User> users = showUserView();
        for (User user : users){
            if (user.getAccount().equals(username)&&user.getPassword().equals(password)&&user.getRole().equals(Role.Admin)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User userLogin(String username, String password) {
        return null;
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void addUser() {

    }

    @Override
    public void removeUser() {

    }

    @Override
    public boolean checkExistByID(long id) {
        return false;
    }

    @Override
    public User findUserByID(long id) {
        return null;
    }
}

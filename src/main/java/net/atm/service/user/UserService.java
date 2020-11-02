package net.atm.service.user;

import java.util.List;

import net.atm.doa.user.*;
import net.atm.doa.user.UserDoa;
import net.atm.model.user.User;

public class UserService {

    private final UserDoa udi;

    public UserService(){
        udi = new UserDoaImpl();
    }

    public void insertUser(User user) {
        udi.insertUser(user);
    }

    public void updateUser(User user) {
        udi.updateUser(user);
    }

    public void insertUserAccount(int userId, int accountId){
        udi.insertUserAccount(userId, accountId);
    }

    public User selectUser(int id) {
        return udi.selectUser(id);
    }

    public List<User> selectAllUser() {
        return udi.selectAllUser();
    }

    public void deleteUser(int id) {
        udi.deleteUser(id);
    }
}
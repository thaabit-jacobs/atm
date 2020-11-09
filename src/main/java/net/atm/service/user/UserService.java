package net.atm.service.user;

import java.time.LocalDateTime;
import java.util.List;

import net.atm.AccountSupport;
import net.atm.doa.user.*;
import net.atm.doa.user.UserDoa;
import net.atm.model.account.Account;
import net.atm.model.user.User;
import net.atm.service.account.AccountService;
import net.atm.types.AccountType;

public class UserService {

    private final UserDoa udi;

    public UserService(){
        udi = new UserDoaImpl();
    }

    public void insertUser(User user) {
        udi.insertUser(user);
        new AccountService().insertAccount(new Account(new AccountService().selectAllAccounts().size() > 0 ? new AccountService().selectAllAccounts().get(new AccountService().selectAllAccounts().size() - 1).getId() + 1 : 1, "savings", AccountType.SavingsAccount.toString(), new AccountSupport().generateAccountNum(), 0.00,LocalDateTime.now(), user.getId()));
    }

    public void updateUser(User user) {
        udi.updateUser(user);
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

    public List<Account> selectAllUsersAccount(int id){
        return udi.selectAllUserAccounts(id);
    }

    public Account selectAUserAccount(int id,int userId){
        return udi.selectUserAccount(id, userId);
    }
   
    public User selectUserIfExist(String email, String password){
        return udi.selectUserIfExist(email, password);
    }
}

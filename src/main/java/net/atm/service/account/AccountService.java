package net.atm.service.account;

import java.util.List;

import net.atm.doa.account.*;
import net.atm.model.account.Account;

public class AccountService {

    private final AccountDoa adi;

    public AccountService(){
        adi = new AccountDoaImpl();
    }    

    public void insertAccount(Account account) {
        adi.insertAccount(account);
   }

   public void updateAccount(Account account) {
    adi.updateAccount(account);
    }

    public void insertAccountTransac(int accountId, int transacId){
      adi.insertAccountTransac(accountId, transacId);
     }

     public void deleteAccount(int id) {
        adi.deleteAccount(id);
    }

    public List<Account> selectAllAccounts() {
        return adi.selectAllAccounts();
     }

     public Account selectAccount(int id) {
        return adi.selectAccount(id);
     }
}

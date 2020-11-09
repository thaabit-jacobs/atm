package net.atm.service.account;

import java.time.LocalDateTime;
import java.util.List;

import net.atm.doa.account.*;
import net.atm.model.account.Account;
import net.atm.model.transaction.Transaction;
import net.atm.service.transaction.TransactionService;
import net.atm.types.TransactionType;

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

     public void deleteAccount(int id) {
        adi.deleteAccount(id);
    }

    public List<Account> selectAllAccounts() {
        return adi.selectAllAccounts();
     }

     public Account selectAccount(int id) {
        return adi.selectAccount(id);
     }

     public List<Transaction> selectAllAccountTransac(int i){
        return adi.selectAllAccountTransacs(i);
     }



}

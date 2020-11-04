package net.atm;

import net.atm.controller.AccountsController;
import net.atm.controller.UserController;
import net.atm.model.account.Account;
import net.atm.model.transaction.Transaction;
import net.atm.model.user.User;
import net.atm.service.account.AccountService;
import net.atm.service.transaction.TransactionService;
import net.atm.service.user.UserService;
import net.atm.types.AccountType;
import net.atm.types.TransactionType;

import java.time.LocalDateTime;

public class MainDemo {
    public static void main(String[] args) {
        UserService us = new UserService();
        AccountService as = new AccountService();
        TransactionService ts = new TransactionService();

        us.insertUser(new User(3, "Bill", "Swarts", "0000", "swarts@java.com", LocalDateTime.now()));
        as.insertAccount(new Account(3, "savings", AccountType.SavingsAccount.toString(), 144857895, 0.00, LocalDateTime.now(), 3));
        ts.insertTransac(new Transaction(2, TransactionType.BalanceEnquiry.toString(), false, 0.00, LocalDateTime.now(), 3));

        new UserController(new UserService());
        new AccountsController(new AccountService());
    }
}
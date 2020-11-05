package net.atm.controller;

import net.atm.service.account.AccountService;
import net.atm.service.user.UserService;

import static spark.Spark.get;

public class AccountsController {
    public AccountsController(final AccountService accountService){
        //get("/accounts/transactions/:id", (request, response) -> accountService.selectAllAccountTransac(Integer.valueOf(request.params(":id")).intValue()), json());

    }
}

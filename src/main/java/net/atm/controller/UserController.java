package net.atm.controller;

import static spark.Spark.*;

import net.atm.model.user.User;
import net.atm.service.user.UserService;

public class UserController {
    public UserController(final UserService userService){

        post("/users",  (request, response) -> {
            
        });
        get("/users", (request, response) -> userService.selectAllUser());

        get("/users/:id", (request, response) -> {
            return userService.selectUser(Integer.valueOf(request.params(":id")).intValue());
        });

    }
}

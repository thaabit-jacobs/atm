package net.atm.controller;

import static spark.Spark.*;
import static net.atm.util.JsonUtil.*;

import net.atm.service.user.UserService;

public class UserController {
    public UserController(final UserService userService){
        get("/users", (request, response) -> userService.selectAllUser(), json());
    }
}

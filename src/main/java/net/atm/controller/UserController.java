package net.atm.controller;

import static spark.Spark.*;

import com.google.gson.Gson;
import net.atm.model.user.User;
import net.atm.service.user.UserService;
import net.atm.types.StatusResponse;
import net.atm.util.StandardResponse;

public class UserController {
    public UserController(final UserService userService){
        post("/users", (request, response) -> {
            response.type("application/json");
            User user = new Gson().fromJson(request.body(), User.class);

            userService.insertUser(user);

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
        });

        get("/users", (request, response) -> {
            response.type("application/json");

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(userService.selectAllUser())));
        });

        get("/users/:id", (request, response) -> {
            response.type("application/json");

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(userService.selectUser(Integer.valueOf(request.params(":id"))))));
        });

        get("/users/accounts/:id", (request, response) -> {
            response.type("application/json");

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(userService.selectAllUsersAccount(Integer.valueOf(request.params(":id"))))));
        });

        put("/users/:id", (request, response) -> {
            response.type("application/json");

            User toEdit = new Gson().fromJson(request.body(), User.class);
            userService.updateUser(toEdit);

            if(toEdit != null){
                return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(toEdit)));
            } else{
                return new Gson().toJson(new StandardResponse(StatusResponse.ERROR, new Gson().toJson("Unable to edit user")));
            }
        });


    }
}

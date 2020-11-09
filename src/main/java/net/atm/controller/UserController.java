package net.atm.controller;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import net.atm.model.user.User;
import net.atm.service.user.UserService;
import net.atm.types.StatusResponse;
import net.atm.util.StandardResponse;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class UserController {
    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

    
    public UserController(final UserService userService){
        staticFiles.location("/public");
        get("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();

            return render(model, "login.hbs");
        });

        post("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<>();

            User user = userService.selectUserIfExist(request.queryParams("email"), request.queryParams("password"));

            if(user != null){
                int userId = user.getId();
                response.redirect("/users/" + userId);
            }

            return render(model, "login.hbs");
        });

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
            Map<String, Object> model = new HashMap<>();

            int userId = Integer.valueOf(request.params(":id")).intValue();


            model.put("accountsList", new Gson().toJsonTree(userService.selectAllUsersAccount(userId)));
            return render(model, "UserDashBoard.hbs");
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

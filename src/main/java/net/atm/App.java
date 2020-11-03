package net.atm;

import net.atm.controller.UserController;
import net.atm.service.user.UserService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        new UserController(new UserService());
    }

}

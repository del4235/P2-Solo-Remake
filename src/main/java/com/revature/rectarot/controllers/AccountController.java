package com.revature.rectarot.controllers;

import com.revature.rectarot.services.UserService;

public class AccountController {
    final UserService userService;

    public AccountController(UserService userService) {
        this.userService = userService;
    }
    //Register Login Logout Delete Change Username Change Password Change Email

}

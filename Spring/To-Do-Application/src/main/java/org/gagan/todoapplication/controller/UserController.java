package org.gagan.todoapplication.controller;

import org.gagan.todoapplication.services.UserServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
        var userModel = new org.gagan.todoapplication.models.UserModel();
        userModel.setEmail(email);
        userModel.setPassword(password);
        return userServices.login(userModel);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        var userModel = new org.gagan.todoapplication.models.UserModel(name, email, password);
        return userServices.signup(userModel);
    }
}

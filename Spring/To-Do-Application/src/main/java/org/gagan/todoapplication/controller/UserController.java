package org.gagan.todoapplication.controller;

import org.gagan.todoapplication.models.UserModel;
import org.gagan.todoapplication.repository.UserRepository;
import org.gagan.todoapplication.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private final UserServices userServices;
    @Autowired
    private final UserRepository userRepository;

    public UserController(UserServices userServices, UserRepository userRepository) {
        this.userServices = userServices;
        this.userRepository = userRepository;
    }

    @PostMapping("/login")
    public UserModel Login(@RequestParam String name, @RequestParam String email, @RequestParam String password){
        UserModel userModel = new UserModel(name,email,password);
        return userModel;
    }
}

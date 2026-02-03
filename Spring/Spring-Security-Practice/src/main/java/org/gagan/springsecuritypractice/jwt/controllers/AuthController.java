package org.gagan.springsecuritypractice.jwt.controllers;

import lombok.AllArgsConstructor;
import org.gagan.springsecuritypractice.jwt.repository.UserRepository;
import org.gagan.springsecuritypractice.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AuthController {
    private final UserService userService;

}

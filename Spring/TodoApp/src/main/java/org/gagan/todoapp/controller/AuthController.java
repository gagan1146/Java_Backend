package org.gagan.todoapp.controller;

import org.gagan.todoapp.dto.SignupRequest;
import org.gagan.todoapp.service.AuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;


    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/signup")
    public String signup(@ResponseBody SignupRequest request){
        return authService.signup(request.username,request.password);
    }
}

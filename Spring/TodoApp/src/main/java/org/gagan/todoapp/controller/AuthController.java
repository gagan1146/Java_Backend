package org.gagan.todoapp.controller;

import org.gagan.todoapp.dto.LoginRequest;
import org.gagan.todoapp.dto.SignupRequest;
import org.gagan.todoapp.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    @GetMapping
    public String Home() {
        return "Home";
    }

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public String signup(@RequestParam String username, @RequestParam String password, @RequestParam String contactNumber, @RequestParam String secret) {
        System.out.println("Signup page");
        return authService.signup(username, password, contactNumber, secret);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request.username, request.password);
    }
}

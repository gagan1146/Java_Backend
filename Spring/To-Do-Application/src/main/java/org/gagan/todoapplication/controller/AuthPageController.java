package org.gagan.todoapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthPageController {

    
    @GetMapping("/forgot-password")
    public String forgetPasswordPage() {
    	return "forgot-password";
    }



    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}

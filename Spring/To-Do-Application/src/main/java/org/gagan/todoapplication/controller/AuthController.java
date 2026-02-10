package org.gagan.todoapplication.controller;

import java.time.LocalDate;

import org.gagan.todoapplication.service.OtpPurpose;
import org.gagan.todoapplication.service.OtpService;
import org.gagan.todoapplication.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    private final UserService userService;
    private final OtpService otpService;

    public AuthController(UserService userService, OtpService otpService) {
        this.userService = userService;
        this.otpService = otpService;
    }
    
    @PostMapping("/change-forget-password")
    public String forgotPassword(@RequestParam String email) {

        userService.forgotPassword(email);
        return "redirect:/otp?email=" + email;
    }

    @PostMapping("/verify-forgot-otp")
    public String verifyForgotOtp(@RequestParam String email,
                                  @RequestParam String otp) {

        otpService.verifyOtp(email, otp, OtpPurpose.FORGOT_PASSWORD);
        return "redirect:/reset-password?email=" + email;
    }

    @PostMapping("/reset-password")
    public String resetPassword(@RequestParam String email,
                                @RequestParam String password) {

        userService.resetPassword(email, password);
        return "redirect:/login?resetSuccess";
    }
}

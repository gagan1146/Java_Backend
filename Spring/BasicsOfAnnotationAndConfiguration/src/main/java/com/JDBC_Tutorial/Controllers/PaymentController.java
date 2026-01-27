package com.JDBC_Tutorial.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @GetMapping("/upi")
    public String UpiPayment(){
        return "I am using UPI as a Payment Gateway"
    }
}

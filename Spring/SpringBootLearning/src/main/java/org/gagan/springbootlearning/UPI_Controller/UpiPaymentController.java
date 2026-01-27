package org.gagan.springbootlearning.UPI_Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upi")
public class UpiPaymentController {
    @GetMapping("/google-pay")
    public String GooglePay(){
        return "I am using GooglePay as a UPI Interface";
    }
}

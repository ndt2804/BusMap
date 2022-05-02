package com.example.busmap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PaymentController {
    @RequestMapping( "Payment")
    public String Payment() {
        return "Payment";
    }
}

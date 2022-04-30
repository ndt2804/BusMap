package com.example.busmap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuyTicketController {
    @RequestMapping("BuyTicket")
    public String buyticket() {return "BuyTicket";}
}

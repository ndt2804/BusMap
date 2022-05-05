package com.example.busmap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusrouteController {
    @RequestMapping("busroute")
    public String busroute() {return "busroute";}
}

package com.egorl.intlerarduinoclient.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("arduino-client")
    public String getArduinoClientPage() {
        return "arduinoClient";
    }
}

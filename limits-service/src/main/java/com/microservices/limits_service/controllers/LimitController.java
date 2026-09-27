package com.microservices.limits_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @GetMapping("/limits")
    public String getLimts(){
        return "Limits";
    }
}

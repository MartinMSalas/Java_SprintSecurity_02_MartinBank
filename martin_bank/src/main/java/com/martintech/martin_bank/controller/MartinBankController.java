package com.martintech.martin_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MartinBankController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Martin Bank";
    }
}

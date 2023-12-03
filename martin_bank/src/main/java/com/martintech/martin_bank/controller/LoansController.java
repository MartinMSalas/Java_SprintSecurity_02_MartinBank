package com.martintech.martin_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan")
public class LoansController {

    @GetMapping
    public String getLoans() {
        return "Here are your loans from Martin Bank DB";
    }
}

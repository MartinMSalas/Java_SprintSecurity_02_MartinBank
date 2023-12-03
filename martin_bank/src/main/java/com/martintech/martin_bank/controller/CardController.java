package com.martintech.martin_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    @GetMapping
    public String getCardDetails() {
        return "Here are your cards from Martin Bank DB";
    }
}

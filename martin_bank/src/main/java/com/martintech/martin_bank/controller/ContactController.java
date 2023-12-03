package com.martintech.martin_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @GetMapping
    public String getContactDetails() {
        return "Here are your contact details from Martin Bank DB";
    }

    @PostMapping
    public String saveContactInquiryDetails(){
        return "Contact inquiry details saved successfully";
    }

}

package com.martintech.martin_bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @GetMapping("/notices")
    public String getNotices() {
        return "Here are your notices from Martin Bank DB";
    }
}

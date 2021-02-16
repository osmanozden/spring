package com.example.osman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class m_api {
    @RequestMapping("/message")
    @GetMapping
    public String merhaba(){
        return "hello world";
    }
    @RequestMapping("/customer")
    @GetMapping
    public String adress(){
        return "adressInfo: ISTANBUL/TURKEY";
    }
}

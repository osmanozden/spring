package com.example.osman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mesaj")
public class m_api {
    @GetMapping
    public String merhaba(){
        return "hello world";
    }
}

package com.example.apikey.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("home")
    public String home() {
        return "Home";
    }
}

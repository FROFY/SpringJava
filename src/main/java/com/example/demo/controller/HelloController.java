package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "<div>Hello</div>";
    }
    @GetMapping("/sum")
    public Integer getSum() {
        return 10 + 15;
    }
}

package ru.darek.java_pro_spring24.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String hello(){
        return "Sprawdzian dzialania";
    }
}


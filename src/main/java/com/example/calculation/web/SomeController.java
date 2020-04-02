package com.example.calculation.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/sample")
    public String sample() {
        return "Sample";
    }
}

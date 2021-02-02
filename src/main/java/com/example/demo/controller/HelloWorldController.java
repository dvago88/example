package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public String test(@RequestParam String name) {
        return name;
    }

    @GetMapping("/suma")
    @ResponseBody
    public int sum(@RequestParam int firstNumber, @RequestParam int secondNumber) {
        return firstNumber+secondNumber;
    }
}

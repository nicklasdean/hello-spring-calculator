package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirstController {
    @GetMapping("/")
    @ResponseBody
    public String calc() {
        return "Front Page";
    }
    @GetMapping("/HelloWorld")
    @ResponseBody
    public String helloWorld() {
        return "Front Page";
    }
}

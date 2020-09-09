package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class EchoController {
    //Remember to provide parameters to calculate
    //Otherwise a white-label error will occur
    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam String stringFromParameter) {
        return stringFromParameter;
    }
}

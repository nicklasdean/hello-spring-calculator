package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class EchoController {
    //Remember to provide parameters to calculate
    //Otherwise a white-label error will occur

    //A parameter is provided by localhost:8080?[name of RequestParam]=[Parameter]
    //E.g: localhost:8080?stringFromParameter=HiWorld
    //Should yield the result HiWorld
    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam String stringFromParameter) {
        return stringFromParameter;
    }
}

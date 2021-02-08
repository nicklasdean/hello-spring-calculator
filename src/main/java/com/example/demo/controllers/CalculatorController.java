package com.example.demo.controllers;

import com.example.demo.services.WorldSimplestCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
    //Remember to provide parameters to calculate
    //A parameter is provided by localhost:8080?[name of RequestParam]=[Parameter]
    //E.g: localhost:8080?intFromUrl=5
    //Should yield the reuslt 10

    //Otherwise a white-label error will occur
    @GetMapping("/calc")
    @ResponseBody
    public int calculateProduct(@RequestParam int intFromURL){
        WorldSimplestCalculator calculator = new WorldSimplestCalculator();
        return calculator.returnProduct(intFromURL);
    }
}

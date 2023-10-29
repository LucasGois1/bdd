package com.contract.producer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private OddEvenService oddEvenService;

    @GetMapping("/validate/even-odd")
    public String isNumberPrime(@RequestParam("number") Integer number) {
        return oddEvenService.oddOrEven(number);
    }
}
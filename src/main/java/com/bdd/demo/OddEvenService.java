package com.bdd.demo;

import org.springframework.stereotype.Service;

@Service
public class OddEvenService {
    String oddOrEven(final Integer number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}

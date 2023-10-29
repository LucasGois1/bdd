package com.bdd.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class OddEvenServiceTest {

    private Integer inputNumber;
    private String result;

    @Given("number is {string}")
    public void number_is(String string) {
        inputNumber = Integer.valueOf(string);
    }

    @When("I ask if is Odd or Even")
    public void i_ask_if_is_odd_or_even() {
        final var oddEvenService = new OddEvenService();

        result = oddEvenService.oddOrEven(inputNumber);
    }
    @Then("It should be {string}")
    public void it_should_be_odd(String expectedAnswer) {
        assertEquals(expectedAnswer, this.result);
    }
}
package com.bdd.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordLengthTest {

    private String inputWord;
    private int result;

    @Given("the word {string}")
    public void word_is(String string) {
        inputWord = string;
    }
    @When("I calculate the length of the word")
    public void i_calculate_the_length_of_the_word() {
        final var wordLengthService = new WordLengthService();

        result = wordLengthService.howMuchLetters(inputWord);
    }
    @Then("It word length should be {int}")
    public void it_word_length_should_be(int expectedLength) {
        assertEquals(expectedLength, this.result);
    }
}

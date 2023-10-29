@examples
Feature: What is the length of a word?
  Every body wants to know the length of the words

  Scenario Outline: Calculate the length of a word
    Given the word "<word>"
    When I calculate the length of the word
    Then It word length should be <length>
    Examples:
        | word | length |
        | cat  | 3      |
        | dog  | 3      |
        | bird | 4      |
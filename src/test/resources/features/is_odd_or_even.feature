Feature: Is a number Odd or Even?
  Every body wants to know if a number is Odd or Even (I'm a documentation line, Cucumber doesn't execute me)

#  Scenario: Two is Even
#    Given number two
#    When I ask if is Odd or Even
#    Then It should be "Even"

  # Scenario Outline permite testar com varios inputs diferentes
  Scenario Outline: number is even or odd
    Given number is "<number>"
    When I ask if is Odd or Even
    Then It should be "<result>"
    Examples:
      | number | result |
      | 1      | Odd    |
      | 2      | Even   |
      | 3      | Odd    |
      | 4      | Even   |
      | 5      | Odd    |
      | 6      | Even   |
      | 7      | Odd    |
      | 8      | Even   |
      | 9      | Odd    |
      | 10     | Even   |
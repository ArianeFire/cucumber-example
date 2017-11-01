Feature: Calculator
  Calculator is giving to numbers, the calculator perform operation on them.

  Scenario Outline: Sum two numbers
    Given I have two numbers <number1> and <number2>
    When I calculate the sum
    Then It must be equals to <sum>
    Examples:
      | number1 | number2 | sum |
      | 1       | 1       | 2   |
      | 2       | 2       | 4   |


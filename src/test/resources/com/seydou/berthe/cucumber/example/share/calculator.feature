Feature: Calculator
  Calculator is giving to numbers, the calculator perform operation on them.

  Scenario Outline: Sum two numbers
    Given I have two numbers <number1> and <number2>
    When I calculate the sum
    Then The result must be equals to <result>
    Examples:
      | number1 | number2 | result |
      | 1       | 1       | 2      |
      | 2       | 2       | 4      |


  Scenario Outline: Subtract two numbers
    Given I have two numbers <number1> and <number2>
    When I calculate the subtract
    Then The result must be equals to <result>
    Examples:
    Examples:
      | number1 | number2 | result |
      | 1       | 1       | 0      |
      | 2       | 2       | 0      |


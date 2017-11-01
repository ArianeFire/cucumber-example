package com.seydou.berthe.cucumber.example.calculator;

import static org.junit.Assert.assertEquals;

import cucumber.api.java8.En;

public class CalculatorStepdefs implements En {

    private Calculator calculator;

    public CalculatorStepdefs() {

        Given("^I have two numbers (\\d+) and (\\d+)$", (Integer number1, Integer number2) -> {
            calculator = new Calculator();
            calculator.setNumber1(number1);
            calculator.setNumber2(number2);
        });

        When("^I calculate the sum$", () -> {
            calculator.performSum();
        });

        Then("^It must be equals to (\\d+)$", (Integer sum) -> {
            assertEquals(calculator.getSum(), sum);
        });
    }
}

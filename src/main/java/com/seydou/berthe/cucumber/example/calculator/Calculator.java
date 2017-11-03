package com.seydou.berthe.cucumber.example.calculator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Calculator {

    private Integer number1;
    private Integer number2;
    private Integer result;

    public void performSum() {
        result = getNumber1() + getNumber2();
    }

    public void performSubtract() {
        result = getNumber1() - getNumber2();
    }
}

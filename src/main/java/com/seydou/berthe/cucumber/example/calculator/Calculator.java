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
    private Integer sum;

    public void performSum() {
        sum = getNumber1() + getNumber2();
    }
}

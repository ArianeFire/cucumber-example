package com.seydou.berthe.cucumber.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Score {

    private Integer value;

    public Score() {
        value = 0;
    }
}

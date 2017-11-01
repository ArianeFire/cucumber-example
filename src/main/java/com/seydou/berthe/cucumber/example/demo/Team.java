package com.seydou.berthe.cucumber.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {

    private Score score;

    public Team() {
        score = new Score();
    }
}

package com.seydou.berthe.cucumber.example.skeleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Belly {

    private int cukes;
    private int wait;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public void wait(int hour) {
        this.wait = wait;
    }

    public void growl() {

        if (this.cukes > 42 && wait >= 1) {
            System.out.println("Belly is growling...");
            return;
        }

        System.out.println("Belly can't growl, didn't eat or wait enough");
    }
}

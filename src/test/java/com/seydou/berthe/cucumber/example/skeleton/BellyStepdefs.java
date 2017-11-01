package com.seydou.berthe.cucumber.example.skeleton;

import cucumber.api.java8.En;

public class BellyStepdefs implements En {

    private Belly belly;

    public BellyStepdefs() {

        Given("^I have (\\d+) cukes in my belly$", (Integer cukes) -> {
            belly = new Belly();
            belly.eat(cukes);
        });

        When("^I wait (\\d+) hour$", (Integer wait) -> {
            belly.wait(wait);
        });

        Then("^my belly should growl$", () -> {
            belly.growl();
        });
    }

}

package com.seydou.berthe.cucumber.example.demo;

import static org.junit.Assert.assertEquals;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import java.util.Map;

public class DemoStepdefs implements En {

    private Team team;

    public DemoStepdefs() {

        Given("^I register a team$", () -> {

            team = new Team();
        });

        Then("^My score is (\\d+)", (Integer score) -> {
            assertEquals(score.intValue(), team.getScore().getValue().intValue());
        });

        Given("^the leader board look like:$", (DataTable dataTable) -> {
            Map<String, Integer> leaders = dataTable.asMap(String.class, Integer.class);
            assertEquals(leaders.get("Pirates").intValue(), 20);
        });
    }
}

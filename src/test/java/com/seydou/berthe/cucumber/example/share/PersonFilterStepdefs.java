package com.seydou.berthe.cucumber.example.share;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java8.En;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonFilterStepdefs implements En {

    @Autowired
    private World world;
    private PersonFilterService service;

    public PersonFilterStepdefs() {

        service = new PersonFilterService();

        When("^I filter the list$", () -> {
            List<Person> persons = service.filter(world.getInputs(), world.getCriteria());
            assertNotNull(persons);
            world.setResults(persons);
        });

        Then("^The number of returned person must be : (\\d+)$", (Integer size) -> {

            assertEquals(size.intValue(), world.getResults().size());
        });
    }
}

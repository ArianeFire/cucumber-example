package com.seydou.berthe.cucumber.example.share;

import static org.junit.Assert.assertNotNull;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonInitStepdefs implements En {

    @Autowired
    private World world;

    public PersonInitStepdefs() {

        Given("^List of person :$", (DataTable persons) -> {

            List<Person> inPersons = persons.asList(Person.class);
            assertNotNull(inPersons);

            world.setInputs(inPersons);
        });
    }
}

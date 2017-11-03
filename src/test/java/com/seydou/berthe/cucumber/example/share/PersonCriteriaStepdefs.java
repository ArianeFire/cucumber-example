package com.seydou.berthe.cucumber.example.share;

import static org.junit.Assert.assertNotNull;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonCriteriaStepdefs implements En {

    @Autowired
    private World world;

    public PersonCriteriaStepdefs() {

        And("^following criteria :$", (DataTable criteria) -> {
            List<PersonFilterCriteria> pCriteria = criteria.asList(PersonFilterCriteria.class);
            assertNotNull(pCriteria);
            world.setCriteria(pCriteria.get(0));
        });
    }

}

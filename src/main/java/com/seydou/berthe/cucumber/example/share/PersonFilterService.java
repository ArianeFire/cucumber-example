package com.seydou.berthe.cucumber.example.share;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterService {


    public List<Person> filter(List<Person> persons, PersonFilterCriteria personFilterCriteria) {

        assert personFilterCriteria != null;

        List<Person> results = persons;

        return results.stream().filter(p -> respectCriteria(p, personFilterCriteria)).collect(Collectors.toList());
    }

    private boolean respectCriteria(Person person, PersonFilterCriteria criteria) {

        boolean ok = true;

        if (criteria.getName() != null && !criteria.getName().isEmpty()) {
            ok = person.getName().contains(criteria.getName());
        }

        if (criteria.getAge() != null && criteria.getAge() > 0) {
            ok = person.getAge() >= criteria.getAge();
        }

        if (criteria.getSexe() != null && !criteria.getSexe().isEmpty()) {
            ok = person.getSexe().equals(criteria.getSexe());
        }

        return ok;
    }
}

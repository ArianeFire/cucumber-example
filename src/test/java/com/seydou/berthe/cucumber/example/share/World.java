package com.seydou.berthe.cucumber.example.share;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
public class World {

    private List<Person> inputs;
    private PersonFilterCriteria criteria;
    private List<Person> results;
}

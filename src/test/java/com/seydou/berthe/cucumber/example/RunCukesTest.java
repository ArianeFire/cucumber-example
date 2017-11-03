package com.seydou.berthe.cucumber.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = {
    "src/test/resources/com/seydou/berthe/cucumber/example/share/person-filter.feature"})
public class RunCukesTest {

}

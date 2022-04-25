package com.wiz.runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/specificProduct.feature"},
        glue = {"com.wiz.stepdefinitions"})
public class RunnerCaseOne {
}

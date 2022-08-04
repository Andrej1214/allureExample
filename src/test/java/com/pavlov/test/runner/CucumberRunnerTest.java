package com.pavlov.test.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true,
        glue = "com.pavlov.test",
        features = "src/test/resources/com.pavlov.test.features"
)
public class CucumberRunnerTest {
}

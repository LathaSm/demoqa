package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/Login.feature",
    glue = "stepdefinitions",
       		plugin = {
    				  "pretty",
    				  "json:target/cucumber-reports/Cucumber.json",
    				  "html:target/cucumber-reports"
    				},

    tags = "not @skip"
)
public class TestRunner {

}

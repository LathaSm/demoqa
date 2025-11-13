package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features",
  glue = "stepdefinitions",
  
  tags = "not @skip", // 👈 This excludes all @skip scenarios
  plugin = {  "pretty", "json:target/cucumber-reports/report.json",
		  "html:target/cucumber-reports/html/index.html"

},
  monochrome = true

)
public class TestRunner {}


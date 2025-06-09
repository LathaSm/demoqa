package stepdefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import com.aventstack.extentreports.*;
import utils.ExtentManager;

public class CucumberHooks {
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ExtentTest scenarioTest;

    @Before
    public void beforeScenario(Scenario scenario) {
        scenarioTest = extent.createTest(scenario.getName());
        scenarioTest.info("Starting scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            scenarioTest.fail("Scenario failed: " + scenario.getName());
        } else {
            scenarioTest.pass("Scenario passed: " + scenario.getName());
        }
        extent.flush();
    }
}


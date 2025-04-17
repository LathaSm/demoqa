package stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import pages.DemoQATextBox;
import utils.ConfigReader;

public class TextboxStep {
	
	private WebDriver driver;
	ConfigReader configReader;
	public DemoQATextBox demoqatextbox;
	private boolean skipBackground;

    @Before
    public void setUp(Scenario scenario) {
        skipBackground = scenario.getSourceTagNames().contains("@skipBackground");
    }

@Given("User is on the DemoQA text page")
public void user_is_on_the_demo_qa_text_page() {
    // Write code here that turns the phrase above into concrete actions
	
		
		driver= new ChromeDriver(); 
	  configReader = new ConfigReader("src/main/resources/config/locators.properties");
      driver.get(configReader.getProperty("textboxurl"));
		//driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		demoqatextbox = new DemoQATextBox(driver,configReader);
	 	 
}

@When("User enters the Full Name,Email,Current Address,Permanent Address")
public void user_enters_the_full_name_email_current_address_permanent_address() {
    // Write code here that turns the phrase above into concrete actions
	demoqatextbox.enteruserName("latha");
	demoqatextbox.enteruserEmail("lathasmrugan@gmail.com");
	demoqatextbox.entercurrentAddress("Plano");
	demoqatextbox.enterpermanentAddress("Plano");
	
}

@Then("User Clicks on Submit button")
public void user_clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	demoqatextbox.clickSubmitButton();
}

@Then("User should able to see the entered details.")
public void user_should_able_to_see_the_entered_details() {
    // Write code here that turns the phrase above into concrete actions
	demoqatextbox.verifythedetails();
	/*
	 * String actualText_name=demoqatextbox.getDisplayedResultText();
	 * System.out.println(actualText_name); String expectedname = "latha";
	 * assertEquals(expectedname,actualText_name);
	 */
	// Assert.assertEquals(actualText_name, expectedname, "Displayed text does not match!");
}




}

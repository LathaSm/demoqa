package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.CheckBox;
import utils.ConfigReader;


public class Checkboxstep {
	
	private WebDriver driver;
	ConfigReader configReader;
	public CheckBox checkbox;
	

@Given("User is on the DemoQA checkbox page")
public void user_is_on_the_demo_qa_checkbox_page() {
    // Write code here that turns the phrase above into concrete actions
	driver= new ChromeDriver(); 
	driver.get("https://demoqa.com/checkbox/");
	//driver.manage().window().maximize();
	checkbox = new CheckBox(driver,configReader);
}

@When("User checks on Home checkbox")
public void user_checks_on_home_checkbox()  {
    // Write code here that turns the phrase above into concrete actions
	
	checkbox.checkhome();
	
	
	
	
}

@Then("User should be able to see the correct message")
public void user_should_be_able_to_see_the_correct_message() throws InterruptedException{
    // Write code here that turns the phrase above into concrete actions
	
   // checkbox.verifytheresult();
	String S=checkbox.getDisplayedResultText();
   // Thread.sleep(10000);
	//checkbox.ishomechecked();
}




}

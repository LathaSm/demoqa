package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.RadioButtonPage;

public class RadioButtonStep {
	
	private WebDriver driver;
	public RadioButtonPage radiobutton;

	@Given("User is on the DemoQA Radiobutton page")
	public void user_is_on_the_demo_qa_radiobutton_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver= new ChromeDriver();
	    driver.get("https://demoqa.com/radio-button");
	  //driver.manage().window().maximize();
	    radiobutton = new RadioButtonPage(driver);
	}

	@When("User selects on yes button")
	public void user_selects_on_yes_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  radiobutton.selectYes();
		//radiobutton.selectImpressive();
		radiobutton.checknobuttondisabled();
	}

	@Then("verify that selected value is displaying in the page")
	public void verify_that_selected_value_is_displaying_in_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	  // radiobutton.verifytheresult_yes();
		radiobutton.verifytheresult_imp();
	}


}

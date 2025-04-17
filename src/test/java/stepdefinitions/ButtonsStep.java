package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.ButtonsPage;
import pages.WebTablesPage;
public class ButtonsStep {

	private WebDriver driver;
	public ButtonsPage button;
	

@Given("User is on the DemoQA button page")
public void user_is_on_the_demo_qa_button_page() {
    // Write code here that turns the phrase above into concrete actions
	  driver = new ChromeDriver();
	    driver.get("https://demoqa.com/buttons");
		  //driver.manage().window().maximize();
	    button = new ButtonsPage(driver);
}
@When("User clicks on double click button")
public void user_clicks_on_double_click_button() {
    // Write code here that turns the phrase above into concrete actions
	button.doubleclick();
}
@When("User able to see the valid double click message")
public void user_able_to_see_the_valid_double_click_message() {
    // Write code here that turns the phrase above into concrete actions
	button.verifydoubleclick();
}
@When("User clicks on Right click button")
public void user_clicks_on_right_click_button() {
    // Write code here that turns the phrase above into concrete actions
button.rightclick();
}
@When("User able to see the valid Right click message")
public void user_able_to_see_the_valid_right_click_message() {
    // Write code here that turns the phrase above into concrete actions
	button.verifydoubleclick();
	
}
@When("User clicks on Click Me button")
public void user_clicks_on_click_me_button() {
    // Write code here that turns the phrase above into concrete actions
	button.clickme();
}
@When("User able to see the valid Click Me message")
public void user_able_to_see_the_valid_click_me_message() {
    // Write code here that turns the phrase above into concrete actions
	button.verifyclickme();
}



	
}

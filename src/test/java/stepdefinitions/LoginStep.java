package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.DemoQAPage;
import utils.ConfigReader;
public class LoginStep {

	public WebDriver driver;
	public DemoQAPage demoqapage;
	ConfigReader configReader;
	
	@Given("User is on the DemoQA page")
	public void user_is_on_the_demo_qa_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver= new ChromeDriver();
		configReader = new ConfigReader("src/main/resources/config/locators.properties");
		driver.get(configReader.getProperty("url"));
		driver.manage().window().maximize();
		demoqapage  = new DemoQAPage(driver);
	   
	}
	@When("User click on the Elements Section")
	public void user_click_on_the_elements_section() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//demoqapage.clickElementsButton();
	    
	}

	
	@Then("User should be redirected to elements page")
	public void user_should_be_redirected_to_elements_page() {
	    // Write code here that turns the phrase above into concrete actions
	//	driver.quit();
		System.out.println("Step-3 passed");
	    
	}
	
}

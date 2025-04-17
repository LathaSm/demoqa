package stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.BrokenLinksPage;
import pages.DemoQATextBox;
import utils.ConfigReader;

public class BrokenLinksSteps {
	
	private WebDriver driver;
	ConfigReader configReader;
	public BrokenLinksPage brokenlink;

@Given("User is on the DemoQA brokenlinks page")
public void user_is_on_the_demo_qa_brokenlinks_page() {
    // Write code here that turns the phrase above into concrete actions
	  driver= new ChromeDriver(); 
	  configReader = new ConfigReader("src/main/resources/config/locators.properties");
	  driver.get(configReader.getProperty("brokenlink"));
		//driver.get("https://demoqa.com/text-box");
	//	driver.manage().window().maximize();
		brokenlink = new BrokenLinksPage(driver,configReader);
}
@When("User click on Valid link")
public void user_click_on_valid_link() {
    // Write code here that turns the phrase above into concrete actions
   brokenlink.clickvalidlink();
}
@Then("User able to see the webpage")
public void user_able_to_see_the_webpage() {
    // Write code here that turns the phrase above into concrete actions
 //  System.out.println("Need to do write steps");
	
	
	String expectedUrl = "https://demoqa.com/";
	String expectedTitle = "DEMOQA";
	
	/*
	 * String originalWindow = driver.getWindowHandle(); Set<String> allWindows =
	 * driver.getWindowHandles();
	 * 
	 * for (String window : allWindows) { if (!window.equals(originalWindow)) {
	 * driver.switchTo().window(window); break; } }
	 */

	String actualUrl = driver.getCurrentUrl();
	String actualTitle = driver.getTitle();
	System.out.println(actualUrl);
	System.out.println(actualTitle);
	assertEquals(expectedUrl,actualUrl);
	assertEquals(expectedTitle,actualTitle);
}


@When("User click on Invalid link")
public void user_click_on_invalid_link() {
    // Write code here that turns the phrase above into concrete actions
    brokenlink.clickbrokenlink();
}

@Then("User able to see the error message")
public void user_able_to_see_the_error_message() {
    // Write code here that turns the phrase above into concrete actions
	//   System.out.println("Need to do write steps");
	
	String expectedUrl = "https://the-internet.herokuapp.com/status_codes/500";
	String expectedTitle = "The Internet";
	/*
	 * String originalWindow = driver.getWindowHandle(); Set<String> allWindows =
	 * driver.getWindowHandles();
	 * 
	 * for (String window : allWindows) { if (!window.equals(originalWindow)) {
	 * driver.switchTo().window(window); break; } }
	 */

	String actualUrl = driver.getCurrentUrl();
	String actualTitle = driver.getTitle();
	System.out.println(actualUrl);
	System.out.println(actualTitle);
	assertEquals(expectedUrl,actualUrl);
	assertEquals(expectedTitle,actualTitle);
}

}

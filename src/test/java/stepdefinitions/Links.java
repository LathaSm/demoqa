package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.ButtonsPage;
import pages.LinksPage;


public class Links {
	private WebDriver driver;
	public LinksPage links;
	

@Given("User is on the DemoQA links page")
public void user_is_on_the_demo_qa_links_page() {
    // Write code here that turns the phrase above into concrete actions
	driver = new ChromeDriver();
    driver.get("https://demoqa.com/links");
	  //driver.manage().window().maximize();
    links = new LinksPage(driver);
	
	
}
@When("User click on the Home and HomeoEJgv")
public void user_click_on_the_home_and_homeo_e_jgv() {
    // Write code here that turns the phrase above into concrete actions
	links.verifysimplelink();
	
}
@Then("User able to see both the links in new tab")
public void user_able_to_see_both_the_links_in_new_tab() {
    // Write code here that turns the phrase above into concrete actions
	//links.verifydynamiclink();
	System.out.println("Need to write steps");
}

@When("User click on Created")
public void user_click_on_created() {
    // Write code here that turns the phrase above into concrete actions

	links.verify_created();
}

@Then("User able to see the status code and status text")
public void user_able_to_see_the_status_code_and_status_text() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Need to write steps");
}



}

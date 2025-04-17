package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import pages.WebTablesPage;

public class WebTableStep {
	
	private WebDriver driver;
	public WebTablesPage page;
	

@Given("User is on the DemoQA Webtable page")
public void user_is_on_the_demo_qa_webtable_page() {
    // Write code here that turns the phrase above into concrete actions
    driver = new ChromeDriver();
    driver.get("https://demoqa.com/webtables");
	  //driver.manage().window().maximize();
    page = new WebTablesPage(driver);
    
}

@When("User is clicks on Add button")
public void user_is_clicks_on_add_button() {
    // Write code here that turns the phrase above into concrete actions
	
   page.addbutton();
}

@When("User enters all the details and clicks on submit button")
public void user_enters_all_the_details_and_clicks_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    page.clicknew();
}

@Then("verify that the new row added in the webtable")
public void verify_that_the_new_row_added_in_the_webtable() {
    // Write code here that turns the phrase above into concrete actions
	page.verifydetails();
}

@When("User clicks on edit button")
public void user_clicks_on_edit_button() {
    // Write code here that turns the phrase above into concrete actions
    page.clickedit();
}

@When("User change the firsname and age")
public void user_change_the_firsname_and_age() {
    // Write code here that turns the phrase above into concrete actions
   page.editthevalue();
}

@Then("verify that the updated details are displaying in the webtable")
public void verify_that_the_updated_details_are_displaying_in_the_webtable() {
    // Write code here that turns the phrase above into concrete actions
page.verify_the_updated_details();
}

@When("User clicks on delete button")
public void user_clicks_on_delete_button() {
    // Write code here that turns the phrase above into concrete actions
    page.clickdelete();
}
@Then("verify that the removed details are not displaying in the webtable")
public void verify_that_the_removed_details_are_not_displaying_in_the_webtable() {
    // Write code here that turns the phrase above into concrete actions
   page.verifythecount_afterdelete();
}

@When("User selects {int} rows in the dropdownlist.")
public void user_selects_rows_in_the_dropdownlist(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
 page.select_rows();
}

@Then("User see the {int} records in the page.")
public void user_see_the_records_in_the_page(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
  page.verify_dropdownvalue();
}

@When("User clicks on Next page")
public void user_clicks_on_next_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Yet to write the steps");
}

@Then("User should able to see the next page")
public void user_should_able_to_see_the_next_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Yet to write the steps");
}

@When("User clicks on Previous page")
public void user_clicks_on_previous_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Yet to write the steps");
}

@Then("User should able to see the Previous page")
public void user_should_able_to_see_the_previous_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Yet to write the steps");
}

@When("User inputs page no")
public void user_inputs_page_no() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Yet to write the steps");
}

@Then("User should able to see the correct page")
public void user_should_able_to_see_the_correct_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Yet to write the steps");
}

@When("User types in search box")
public void user_types_in_search_box() {
    // Write code here that turns the phrase above into concrete actions
  page.searchbox();
}

@Then("User should able to see the correct row")
public void user_should_able_to_see_the_correct_row() {
    // Write code here that turns the phrase above into concrete actions
   page.verify_search_details();
}



}

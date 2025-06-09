package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pages.BrokenLinksPage;
import pages.Practiseformpage;
import utils.ConfigReader;
import utils.ExcelUtils;

public class PractiseformStep {
	private WebDriver driver;
	ConfigReader configReader;
	public Practiseformpage practiseform;

@Given("User is on the DemoQA Practiseform page")
		public void user_is_on_the_demo_qa_practiseform_page() {
		    // Write code here that turns the phrase above into concrete actions
			driver= new ChromeDriver(); 
			  configReader = new ConfigReader("src/main/resources/config/locators.properties");
		      driver.get(configReader.getProperty("practiseformurl"));
				//driver.get("https://demoqa.com/text-box");
				driver.manage().window().maximize();
				practiseform = new Practiseformpage(driver,configReader);
			 	 
		}

		@When("User enters the Student data")
		public void user_enters_the_student_data() throws Exception {
		    // Write code here that turns the phrase above into concrete actions

			ExcelUtils excelutils = new ExcelUtils("src/test/resources/TestData.xlsx","data");
			Object[][] testData = excelutils.getAllRows();
			for(Object[] row:testData) {
			
			String firstname= row[0].toString();
			String lastname=row[1].toString();
			String email=row[2].toString();
			String mobile= row[3].toString();
			String dob=row[4].toString();
			String curraddress=row[5].toString();
			
		practiseform.enterstudentdetails(firstname, lastname, email, mobile, dob, curraddress);
		practiseform.selectgender();
		practiseform.selectHobbies();
		practiseform.selectpicture();
		practiseform.typeSearchQuery("Mat");
		practiseform.selectSuggestion("Maths");
			}

		}

		@Then("User able click on submit button")
		public void user_able_click_on_submit_button() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

	}


package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;
import utils.LocatorUtil;

import static org.junit.Assert.assertEquals;

import java.time.Duration;


public class DemoQATextBox extends BasePage {
	@FindBy(id="userName") 
	WebElement elefullname;
	@FindBy(id="name") WebElement disname;
	
	/*
	 * @FindBy(xpath="//span[text()='Text Box']") WebElement eletext;
	 */
	/*
	 * @FindBy(id="userName") WebElement elefullname;
	 */
	
	/*
	 * @FindBy(id="userEmail") WebElement eleemail;
	 * 
	 * @FindBy(id="currentAddress") WebElement currentAddressField;
	 * 
	 * @FindBy(id="permanentAddress") WebElement eleperaddress;
	 * 
	 * @FindBy(id="submit") WebElement elesubmitbutton;
	 * 
	 * @FindBy(id="name") WebElement disname;
	 * 
	 * @FindBy(id="email") WebElement disemail;
	 * 
	 * @FindBy(id="currentAddress") WebElement discurraddress;
	 * 
	 * @FindBy(id="permanentAddress") WebElement disperaddress;
	 */
	
	
	
	
	
	
	/*
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 * WebElement element =
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//span[text()='Text Box']")));
	 * 
	 */
	
	
	public DemoQATextBox(WebDriver driver,ConfigReader configReader) {
		super(driver,configReader);
	}
	
	public void enteruserName(String userName) {
		/*
		 * elefullname.sendKeys(userName); String expectedText_name =userName;
		 */
		
		findElement("DemoQATextBox.elefullname",Duration.ofSeconds(10)).sendKeys(userName);
	}
	
	public void enteruserEmail(String userEmail) {
		//eleemail.sendKeys(userEmail);
		findElement("DemoQATextBox.eleemail",Duration.ofSeconds(10)).sendKeys(userEmail);
	}
	
	public void entercurrentAddress(String currentAddress) {
		//currentAddressField.sendKeys(currentAddress);
		findElement("DemoQATextBox.currentAddressField",Duration.ofSeconds(10)).sendKeys(currentAddress);
	}
	
	public void enterpermanentAddress(String permanentAddress) {
		//eleperaddress.sendKeys(permanentAddress);
		findElement("DemoQATextBox.eleperaddress",Duration.ofSeconds(10)).sendKeys(permanentAddress);
	}
	public void clickSubmitButton() {
		clickUsingJS("DemoQATextBox.elesubmitbutton");
	}

	  public String getDisplayedResultText() {
	        return getTextFromElement("DemoQATextBox.disname",Duration.ofSeconds(10));
	    }
	 
	public void verifythedetails() {
		if (disname != null) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleId")));
			System.out.println(element.getText());
		} else {
		    System.out.println("Element not found or is null");
		}
	//	String actual_text=disname.getText();
	//	System.out.println(actual_text);
		String expected_text="latha";
		// assertEquals(expected_text,actual_text);
	}
	
	
}

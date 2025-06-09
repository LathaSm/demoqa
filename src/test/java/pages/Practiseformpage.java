package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;

public class Practiseformpage extends BasePage {

	 @FindBy(xpath = "//div[@class='css-12jo7m5 subjects-auto-complete__multi-value__label']")  // Suggestions list
	    List<WebElement> suggestions= new ArrayList<>();;

	public Practiseformpage(WebDriver driver, ConfigReader configReader) {
		super(driver, configReader);
		// TODO Auto-generated constructor stub
	}
	
	public void enterstudentdetails(String firstname, String lastname, String email, String mobile, String dob, String curraddress) {
		
		findElement("pffirstname",Duration.ofSeconds(10)).sendKeys(firstname);
		findElement("pflastname",Duration.ofSeconds(10)).sendKeys(lastname);
		findElement("pfemail",Duration.ofSeconds(10)).sendKeys(email);
		findElement("pfmobile",Duration.ofSeconds(10)).sendKeys(String.valueOf(mobile));
		//driver.findElement(By.id("dateOfBirthInput")).clear();
		
		findElement("pfdob",Duration.ofSeconds(10)).sendKeys(dob);
		findElement("pfcurrentaddress",Duration.ofSeconds(10)).sendKeys(curraddress);
		
		
		
	}
	
	public void selectgender() {
		clickUsingJS("pfgen2");
	}
	
	public void selectHobbies() {
		clickUsingJS("pfhobbies1");
	}
	
	public void selectpicture() {
		clickUsingJS("pfupload");
		
	}

    public void typeSearchQuery(String query) {
     //   searchBox.sendKeys(query);
		findElement("pfsearchbox",Duration.ofSeconds(10)).sendKeys(query);
    }

    public void selectSuggestion(String expectedText) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='css-12jo7m5 subjects-auto-complete__multi-value__label']")));
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equalsIgnoreCase(expectedText)) {
                suggestion.click();
                break;
            }
        }
    }

	public void selectStateandCity() {
		
		
		
	}


	

}




   
   

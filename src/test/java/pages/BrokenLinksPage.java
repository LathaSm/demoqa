package pages;

import utils.ConfigReader;
import utils.LocatorUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

import java.time.Duration;


public class BrokenLinksPage extends BasePage {

	public BrokenLinksPage(WebDriver driver, ConfigReader configReader) {
		super(driver, configReader);
		// TODO Auto-generated constructor stub
	}
	
	public void clickvalidlink() {
		
		clickUsingJS("elevalid");
	}
	public void clickbrokenlink() {
		clickUsingJS("eleinvalid");
	}

}

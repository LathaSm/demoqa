package pages;

import static org.junit.Assert.assertEquals;

import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {

	private WebDriver driver;
	
	@FindBy(id="simpleLink")
	WebElement elesimple;
	
	@FindBy(xpath="//a[contains(@id, 'dynamicLink') and starts-with(text(), 'Home')]")
	WebElement eledynamic;
	
	
	@FindBy(id="created")
	WebElement elecreated;
	
	
	
	@FindBy(id="linkResponse")
	WebElement eleresponse;
	
	public LinksPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void verifysimplelink() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", elesimple);
		String expectedUrl = "https://demoqa.com/";
		String expectedTitle = "DEMOQA";
		
		String originalWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
		    if (!window.equals(originalWindow)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}

		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println(actualUrl);
		System.out.println(actualTitle);
		assertEquals(expectedUrl,actualUrl);
		assertEquals(expectedTitle,actualTitle);
	
	}
	public void verifydynamiclink() {
	
		 
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", eledynamic);
		  String expectedUrl = "https://demoqa.com/";
		  String expectedTitle = "DEMOQA";

		  String originalWindow = driver.getWindowHandle();
		  Set<String> allWindows = driver.getWindowHandles();

		  for (String window : allWindows) {
		    if (!window.equals(originalWindow)) {
		        driver.switchTo().window(window);
		        break;
		    }
		}

		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println(actualUrl);
		System.out.println(actualTitle);
		assertEquals(expectedUrl,actualUrl);
		assertEquals(expectedTitle,actualTitle);
	}
	public void verify_created() {
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", elecreated);
		  
			
			  System.out.println(driver.getPageSource()); WebElement statusCode =
			  driver.findElement(By.cssSelector("#linkResponse b:nth-of-type(1)")); String
			  codeText = statusCode.getText(); System.out.println("Status Code: " +
			  codeText);
			 
		
		  
		  WebElement statusText = driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]"));
		  String responseText = statusText.getText();
		  System.out.println("Status Text: " + responseText);
}
}

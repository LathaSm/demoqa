	package pages;
	
	import static org.junit.Assert.assertEquals;
	
	import java.util.Set;
	import java.time.Duration;

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
	
	public class LinksPage extends BasePage {
	
		private WebDriver driver;
		
		@FindBy(id="simpleLink")
		WebElement elesimple;
		
		@FindBy(xpath="//a[contains(@id, 'dynamicLink') and starts-with(text(), 'Home')]")
		WebElement eledynamic;
		
		
		@FindBy(id="created")
		WebElement elecreated;
		
		
		
		@FindBy(id="linkResponse")
		WebElement eleresponse;
		
		public LinksPage(WebDriver driver,ConfigReader configReader) {
			super(driver, configReader);
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void verifysimplelink() {
	
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("arguments[0].click();", elesimple);
			 */
			
			clickUsingJS("elesimple");
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
			driver.close(); 
			driver.switchTo().window(originalWindow); 
			
		
		}
		public void verifydynamiclink() {
		// Optional: close child window
		
			  
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("arguments[0].click();", eledynamic);
			 */
			clickUsingJS("eledynamic");
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
			driver.close(); 
			driver.switchTo().window(originalWindow); 
			
			 			
		}
		public void verify_created() {
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("arguments[0].click();", elecreated);
			 */
			clickUsingJS("eleid");
				  
	}
		
		public void verify_statuscode_statusresponse()
		{
			System.out.println(driver.getTitle()); 
			/*
			 * WebElement statusCode = driver.findElement(By.id("linkResponse")); String
			 * codeText = statusCode.getText(); System.out.println("Status Code: " +
			 * codeText);
			 */
	String statuscode=getTextFromElement("eleresponse",Duration.ofSeconds(10));
	String statusresponse=getTextFromElement("statusText",Duration.ofSeconds(10));
	System.out.println(statuscode);
	System.out.println(statusresponse);	
	assertEquals("201",statuscode);


	assertEquals("Created",statusresponse);
	/*
		 * WebElement statusText =
		 * driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")); String
		 * responseText = statusText.getText(); System.out.println("Status Text: " +
		 * responseText);
		 */
		}
	}

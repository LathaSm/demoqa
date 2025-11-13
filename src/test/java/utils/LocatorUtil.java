package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorUtil {
	  public WebDriver driver;
	  private ConfigReader configReader;
	    public LocatorUtil(WebDriver driver,ConfigReader configReader) {
	        this.driver = driver;	
	        this.configReader = configReader;
	    }
	 public static By getLocator(String locatorType, String locatorValue) {
	        switch (locatorType.toLowerCase()) {
	            case "id":
	                return By.id(locatorValue);
	            case "name":
	                return By.name(locatorValue);
	            case "xpath":
	                return By.xpath(locatorValue);
	            case "css":
	                return By.cssSelector(locatorValue);
	            case "class_name":
	                return By.className(locatorValue);
	            case "tag_name":
	                return By.tagName(locatorValue);
	            case "link_text":
	                return By.linkText(locatorValue);
	            case "partial_link_text":
	                return By.partialLinkText(locatorValue);
	            default:
	                throw new IllegalArgumentException("Locator type " + locatorType + " is not supported.");
	        }
	    }
	  public String getElementText(String locatorType, String locatorValue, Duration timeout) {
	        By locator = getLocator(locatorType, locatorValue);
	        WebDriverWait wait = new WebDriverWait(driver, timeout);
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	        return element.getText();
	    }
	  
	 
	  public void clickElementWithJS(String locatorType, String locatorValue) {
	        By locator = getLocator(locatorType, locatorValue);
	        WebElement element = driver.findElement(locator);
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("arguments[0].click();", element);
	    }
	  
	  public String getText(String key, Duration timeout) {
	        String locator = configReader.getProperty(key); // Fetch locator from properties file
	        String[] parts = locator.split(":"); // Split into type and value
	        String locatorType = parts[0];
	        String locatorValue = parts[1];

	        By by = getLocator(locatorType, locatorValue); // Generate the locator
	        WebDriverWait wait = new WebDriverWait(driver, timeout);
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	        return element.getText(); // Retrieve and return the visible text
	    }
	}


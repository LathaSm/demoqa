package pages;

import java.time.Duration;
import java.util.List;
import core.DriverFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;
import utils.LocatorUtil;

public class BasePage {
    protected WebDriver driver;
    protected ConfigReader configReader;
    protected LocatorUtil locatorutil;
    
    public BasePage(WebDriver driver, ConfigReader configReader) {
        this.driver =DriverFactory.getDriver();
        this.configReader = configReader;
        this.locatorutil=new LocatorUtil(driver,configReader);
    }

    public WebElement findElement(String key, Duration timeout) {
        String locator = configReader.getProperty(key);
        String[] parts = locator.split(":");
        By by = LocatorUtil.getLocator(parts[0], parts[1]);
        return new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(String key, Duration timeout) {
        String locator = configReader.getProperty(key);
        String[] parts = locator.split(":");
        By by = LocatorUtil.getLocator(parts[0], parts[1]);
        return new WebDriverWait(driver, timeout)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    public String getTextFromElement(String key, Duration timeout) {
        return locatorutil.getText(key, timeout);
    }
    
   
    public void clickUsingJS(String locatorKey) {
        String locator = configReader.getProperty(locatorKey); // e.g., "id:loginButton"
        String[] parts = locator.split(":");
        String locatorType = parts[0];
        String locatorValue = parts[1];
        locatorutil.clickElementWithJS(locatorType, locatorValue);
    }
}
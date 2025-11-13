package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;	
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void setup() {
    	ConfigReader configReader = new ConfigReader("src/test/resources/config.properties"); // ✅
    	String browser = configReader.getProperty("browser");


        WebDriver driver;
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOpts = new ChromeOptions();
                chromeOpts.addArguments("--headless=new", "--disable-gpu", "--window-size=1920,1080");
                driver = new ChromeDriver(chromeOpts);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(); // Add options if needed
                break;

            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        DriverFactory.setDriver(driver);
        driver.manage().window().maximize();
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }
        DriverFactory.quitDriver();
    }

}



package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	
		// TODO Auto-generated method stub

    // Thread-safe WebDriver instance
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    // Initialize WebDriver based on browser type
    public static void initDriver(String browserType) {
        WebDriver driver;

        switch (browserType.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browserType);
        }

        tlDriver.set(driver);
        getDriver().manage().window().maximize();
    }

    // Get current thread's WebDriver
    public static WebDriver getDriver() {
        return tlDriver.get();
    }

    // Quit and clean up WebDriver
    public static void quitDriver() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}


	

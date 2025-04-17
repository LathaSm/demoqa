package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQAPage {

	WebDriver driver;
	
	//@FindBy(xpath="//*[text()='Elements']")
	//@FindBy(xpath="//div[@id='fixedban']")
	WebElement elementButton;

	public DemoQAPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * public void clickElementsButton() throws InterruptedException {
	 * Thread.sleep(5000); elementButton.click();
	 * 
	 * }
	 */
}


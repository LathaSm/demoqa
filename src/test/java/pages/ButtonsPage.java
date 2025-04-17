package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
	private WebDriver driver;
	
	@FindBy(id="doubleClickBtn")
	WebElement eledoubleclick;
	
	@FindBy(id="rightClickBtn")
	WebElement elerightclick;
	
	@FindBy(xpath="//button[(@class='btn btn-primary' and text()=\"Click Me\")]")
	WebElement eleclickme;
	
	
	@FindBy(id="doubleClickMessage")
	WebElement eledoubleclickmsg;
	
	@FindBy(id="rightClickMessage")
	WebElement elerightclickmsg;
	
	@FindBy(id="dynamicClickMessage")
	WebElement eleclickmemsg;
	
	
		public ButtonsPage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void doubleclick() {
		//eledoubleclick.click();
		Actions actions = new Actions(driver);
		actions.doubleClick(eledoubleclick).perform();
	}
	public void rightclick() {
		Actions actions = new Actions(driver);
		actions.contextClick(elerightclick).perform();
	}
	public void clickme() {
		
	eleclickme.click();
	}
	
	public void verifydoubleclick() {
		String expected_text= "You have done a double click";
		String actualtext=eledoubleclickmsg.getText();
		assertEquals(expected_text,actualtext);
		
	}
	
	public void verifyrightclick() {
		String expected_text= "You have done a right click";
		String actualtext=elerightclickmsg.getText();
		assertEquals(expected_text,actualtext);
		
	}
	
	public void verifyclickme() {
		String expected_text= "You have done a dynamic click";
		String actualtext=eleclickmemsg.getText();
		assertEquals(expected_text,actualtext);
		      
	}
}

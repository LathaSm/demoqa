package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
	
	private WebDriver driver;
	
	@FindBy(id="yesRadio")
	WebElement eleyes;
	
	@FindBy(id="impressiveRadio")
	WebElement eleimpressive;
	
	@FindBy(id="noRadio")
	WebElement eleno;
	
	@FindBy(xpath="//span[@class='text-success']")
	WebElement eleyestext;
	
	@FindBy(xpath="//span[@class='text-success']")
	WebElement eleimpressivetext;
	
	
	
	
	public RadioButtonPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectYes() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", eleyes);
	
	}
	public void selectImpressive() {
		//eleimpressive.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", eleimpressive);
	
	}
	public void checknobuttondisabled() {
		boolean bool = eleno.isEnabled();
		if(bool) {
			System.out.println("No radio button is enabled");
		}
		else {
			System.out.println("No radio button is disabled");
		}
	}
	public void verifytheresult_yes() {
		String S=eleyestext.getText();
		System.out.println(S);
	}
	public void verifytheresult_imp() {
		String m=eleimpressivetext.getText();
		System.out.println(m);
		
		  String expectedtext="Impressive"; 
		  assertEquals(expectedtext.trim(), m.trim());
		 
	
		
	}

}

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.LocatorUtil;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class CheckBox extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@title='Expand all']")
	WebElement eleexpandall;
	
	@FindBy(xpath="//button[@title='Collapse all']")
	WebElement elecollapseall;
	
	@FindBy(xpath="//*[@class='rct-checkbox'][1]")
	WebElement elehome;
	
	@FindBy(xpath="//button[@title='Toggle']")
	WebElement eletoggle;//*[@class='rct-checkbox'][1]
	
	@FindBy(id="tree-node-desktop")
	WebElement eledesktop;
	
	@FindBy(xpath="//*[text()='Notes']")
	WebElement elenotes;
	
	@FindBy(xpath="//*[text()='Commands']")
	WebElement elecommands;
	
	@FindBy(id="tree-node-documents")
	WebElement eledocuments;
	
	@FindBy(id="tree-node-workspace")
	WebElement eleworkspace;
	
	@FindBy(xpath="//*[text()='React']")
	WebElement eleReact;
	
	
	
	@FindBy(id="tree-node-office")
	WebElement eleoffice;
	
	@FindBy(id="tree-node-downloads")
	WebElement eledownloads;
	
	@FindBy(id="tree-node-wordFile")
	WebElement elewordfile;
	
	@FindBy(id="tree-node-excelFile")
	WebElement eleexcelfile;
	
	@FindBy(id="result")
	WebElement eleresult;
	
	public CheckBox(WebDriver driver,ConfigReader configReader) {
		/*
		 * this.driver=driver; PageFactory.initElements(driver, this);
		 */
	super(driver,configReader);
	}
		
	public void checkhome() {
		
		
		
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  js1.executeScript("arguments[0].click();", elehome);
		 
		
		/*
		 * clickUsingJS("elehome"); clickUsingJS("CheckBox.eleexpandall");
		 * clickUsingJS("elenotes"); clickUsingJS("elecommands");
		 * clickUsingJS("eleReact");
		 */
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", eleexpandall);
		  
		  
		  JavascriptExecutor jsn = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", elenotes);
		  
		  JavascriptExecutor jsc = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", elecommands); eleReact.click();
		 
			  
			  
		
	}
	
	public void ishomechecked() {
		
		
		  boolean bool= elehome.isSelected(); 
		  System.out.println(bool); 
		  if(bool) {
		  System.out.println("Home checkbox is checked"); } 
		  else {
		  System.out.println("Home checkbox is not checked"); }
		 
		
		
		 
		

	}
	 public String getDisplayedResultText() {
	       return getTextFromElement("eleresult",Duration.ofSeconds(10));
	      
	 }
	
	
	public void verifytheresult() {
		//getElementText()
		String s=eleresult.getText();
		System.out.println(s);
	}

	
	
	
	

	
	

}

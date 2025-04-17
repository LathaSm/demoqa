package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebTablesPage {
	
	

	private WebDriver driver;
	
	@FindBy(id="addNewRecordButton")
	WebElement eleAddbutton;
	
	@FindBy(id="searchBox")
	WebElement eleSearchbox;
	
	@FindBy(id="basic-addon2")
	WebElement eleSearchbutton;
	
	@FindBy(xpath="(//span[@title='Edit' ])[3]")
	WebElement eleedit;
	
	@FindBy(xpath="//span[@title='Delete']")
	WebElement eledelete;
	
	@FindBy(id="firstName")
	WebElement elefname;

	@FindBy(id="lastName")
	WebElement elelname;
	
	@FindBy(id="userEmail")
	WebElement eleemail;
	
	@FindBy(id="age")
	WebElement eleage;
	
	@FindBy(id="salary")
	WebElement elesalary;
	
	@FindBy(id="department")
	WebElement eledept;
		
	@FindBy(id="submit")
	WebElement elesubmit;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"Latha\"]")
	WebElement elenametext;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"Subramaniam Murugan\"]")
	WebElement elelnametext;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"32\"]")
	WebElement eleagetext ;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"Lathasmurugan@gmail.com\"]")
	WebElement eleemailtext;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"50000\"]")
	WebElement elesalarytext;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"QA\"]")
	WebElement eledepttext;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"8000\"]")
	WebElement elesalaryedittext;
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"Karthik\"]")
	WebElement elefnameedittext;
	
	
	@FindBy(xpath="//div[@class='rt-td' and text()=\"34\"]")
	WebElement eleageedittext;	

	@FindBy(xpath="(//span[contains(@id, 'delete-record-')])[1]")
	WebElement eledel;

	@FindBy(xpath="//span[contains(@class, 'select-wrap -pageSizeOptions')]/select")
	WebElement elerows;
	
	@FindBy(xpath="//div[(@class='rt-td' and text()=\"Vega\")]")
	WebElement elesearchresult;
	
	
	
	public WebTablesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addbutton() {
		//eleAddbutton.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", eleAddbutton);
		
	}
	public void clicknew() {
		
		elefname.sendKeys("Latha");
		elelname.sendKeys("Subramaniam Murugan");
		eleemail.sendKeys("Lathasmurugan@gmail.com");
		eleage.sendKeys("32");
		elesalary.sendKeys("50000");
		eledept.sendKeys("QA");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", elesubmit);
	}
	public void verifydetails() {
		 String expectedText = "Latha";
		 String LnameText="Subramaniam Murugan";
		 String emailText="Lathasmurugan@gmail.com";
		 Integer agevalue=32;
		 String expectedValueAsString_age= agevalue.toString();
		 Integer salary=50000;
		 String expectedValueAsString_salary = salary.toString();
		 String Dept="QA";
	     String actualText = elenametext.getText();
	     System.out.println(actualText);
	     String actual_LnameText = elelnametext.getText();
	     String actual_emailText = eleemailtext.getText();
	     String actual_agevalue= eleagetext.getText();
	     String actual_salary = elesalarytext.getText();
	     String actual_Dept= eledepttext.getText();
	     
	     assertEquals(expectedText.trim(), actualText);

	     assertEquals(LnameText.trim(), actual_LnameText.trim());

	     assertEquals(emailText.trim(), actual_emailText.trim());

	     assertEquals(expectedValueAsString_age, actual_agevalue);

	     assertEquals(expectedValueAsString_salary, actual_salary);

	     assertEquals(Dept.trim(), actual_Dept.trim());	  

	     
	}
	public void clickedit() {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", eleedit);
		
		
	}
	
	public void editthevalue() {
		elesalary.clear();
		elesalary.sendKeys("8000");
		elefname.clear();
		elefname.sendKeys("Karthik");
		eleage.clear();
		eleage.sendKeys("34");
			JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elesubmit);
		 
		
	}
	public void verify_the_updated_details() {
		Integer salary=8000;
		 String expectedValueAsString_salary = salary.toString();
		 String actual_salary = elesalaryedittext.getText();
		 System.out.println(actual_salary);
		assertEquals(expectedValueAsString_salary, actual_salary);
		  
		Integer agevalue=34;
		String expectedValueAsString_age= agevalue.toString();
		String actual_age= eleageedittext.getText();
		 System.out.println(actual_age);
		assertEquals(expectedValueAsString_age, actual_age);
		
		String actual_fname= elefnameedittext.getText();
		
		String expectedText = "Karthik";
		assertEquals(expectedText, actual_fname);
		
		
	}
	public void clickdelete() {
		List<WebElement> rowsBeforeDelete= driver.findElements(By.xpath("(//span[contains(@id, 'delete-record-')])"));
		int rowCountBefore = rowsBeforeDelete.size();	
		System.out.println("Row count before deletion: " + rowCountBefore);
	
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", eledel);
		
	}
	
	
	public void verifythecount_afterdelete() {
		List<WebElement> rowsAfterDelete = driver.findElements(By.xpath("(//span[contains(@id, 'delete-record-')])"));
		int rowCountAfter = rowsAfterDelete.size();
		System.out.println("Row count after deletion: " + rowCountAfter);
		
		/*
		 * if (rowCountAfter == rowCountBefore - 1) {
		 * System.out.println("Row deleted successfully!"); } else {
		 * System.out.println("Row deletion failed!"); }
		 */
	}
	
	public void select_rows() {
		Select select = new Select(elerows);
		select.selectByIndex(0);
		
	}

	public void verify_dropdownvalue() {
		Select select = new Select(elerows);
		WebElement selectedOption =select.getFirstSelectedOption();
		String Selected_value=selectedOption.getText();
		System.out.println("Selected Value: " + Selected_value);
		
	
		String expectedValue = "5 rows";
		if (Selected_value.equals(expectedValue)) {
		    System.out.println("Validation Passed: Selected value is correct.");
		} else {
		    System.out.println("Validation Failed: Expected '" + expectedValue + "', but got '" + Selected_value + "'.");
		}

}
	public void searchbox() {
		eleSearchbox.clear();
		eleSearchbox.sendKeys("Ve");
		eleSearchbutton.click();
	}
	public void verify_search_details() {
		
		String actual=elesearchresult.getText();
		String expected = "Vega";
		assertEquals(expected, actual);
		if (actual.equals(expected)) {
		    System.out.println("Validation Passed: Search result is correct.");
		} else {
		    System.out.println("Validation Failed: Expected '" + expected + "', but got '" + actual + "'.");
		}

		}
}

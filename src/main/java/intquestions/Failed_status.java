package intquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Failed_status {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("www.google.com");
	WebElement table= driver.findElement(By.id("tableid"));
	List<WebElement> rows= table.findElements(By.tagName("//tr"));
	
	for(WebElement row:rows) {
		
		String name= row.findElement(By.tagName("/td[1]")).getText();
		String status=row.findElement(By.tagName("/td[3]")).getText();
		
		if(name.equalsIgnoreCase("Latha") && status.equalsIgnoreCase("failed")){
		System.out.println(name +"Match Found"+ status );	
		
		}
	}
	
	}
}
	
	
	



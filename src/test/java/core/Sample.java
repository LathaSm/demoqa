package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
				*****
				 ***
				  */
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
	for(int i=2;i<=rows.size();i++) {
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td"));
		for(int j=1;j<=cols.size();j++) {
			String text=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(text+" ");
		}
		System.out.println();	
		
	}

}
}

package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selected1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement fem=driver.findElement(By.xpath("//input[@value='1']"));
		fem.click();
		boolean fgb=fem.isSelected();
		if(fgb)
		{
			System.out.println("Female radio Button is Selected");
		}
		else
		{
			System.out.println("Female radio button is not selected");
		}
		WebElement mal=driver.findElement(By.xpath("//input[@value='2']"));
		mal.click();
		boolean mgb=mal.isSelected();
		if(mgb)
		{
			System.out.println("Male Radio Button is selected");
		}
		boolean fgb1=fem.isSelected();
		if(!fgb1)
		{
			System.out.println("Female radio Button is not selected");
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
	



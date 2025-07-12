package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://yatra.com/");
		driver.findElement(By.xpath("//div[@class='css-w7k25o']")).click();
		driver.findElement(By.xpath("//span[text()='April 2025']/../../../../..//span[text()='25']")).click();
		driver.close();
		
		
		
		
	}

}

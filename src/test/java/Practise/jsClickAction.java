package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jsClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.name("q")).sendKeys("ABC");
		//Thread.sleep(1000);
		WebElement ele = driver.findElement(By.linkText("Register"));
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
		Thread.sleep(1000);
	
		
		
		
		
	}

}

package Practise;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prgm4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("admin");
		Thread.sleep(500);
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(500);
		ele.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(500);
		ele.sendKeys(Keys.TAB+" "+Keys.CONTROL+"v");
		Thread.sleep(500);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}

package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class emailPwd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("admin@gmail.com");
		email.sendKeys(Keys.CONTROL+"a");
		email.sendKeys(Keys.CONTROL+"c");
		email.sendKeys(Keys.TAB);
		email.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		System.out.println((driver.findElement(By.id("pass"))).getAttribute("value"));
		driver.close();
		
		
		
		
		
		
	}

}

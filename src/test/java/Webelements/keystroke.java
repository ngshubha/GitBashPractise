package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keystroke {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		String msg=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(msg);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pract11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		driver.close();

	}

}

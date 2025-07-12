package Practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yatra.com/");
		driver.findElement(By.xpath("//span[text()='Login / Signup']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("fb-login-btn")).click();
		Thread.sleep(1000);
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> itr=wins.iterator();
		while(itr.hasNext())
		{
			String ref=itr.next();
			driver.switchTo().window(ref);
			System.out.println(driver.getTitle());
		}
		driver.quit();
		
		
	}

}

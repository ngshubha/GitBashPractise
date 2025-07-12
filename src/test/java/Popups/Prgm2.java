package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prgm2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//span[text()='Login / Signup']")).click();
		driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		driver.findElement(By.xpath("//button[text()='sign in with facebook']")).click();
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> itr=wins.iterator();
		itr.next();
		String str=itr.next();
		driver.switchTo().window(str);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		
		
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("9197654321");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.cssSelector("input[class='a-button-input']")).click();
		driver.findElement(By.cssSelector("input[name='customerName']")).sendKeys("abcde");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("abcde");
		driver.findElement(By.cssSelector("span[id='auth-continue']")).click();
		driver.close();
		
		
		
		

	}

}


package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InddepXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("REDMI 9 Activ (Coral Green, 128 GB)  ");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		String text=driver.findElement(By.xpath("//div[@class='KzDlHZ']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(text);
		driver.close();
	}

	
	}



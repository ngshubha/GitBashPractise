package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pratcise9 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//svg[@fill='none']")).click();
		driver.close();
		
		

	}

}

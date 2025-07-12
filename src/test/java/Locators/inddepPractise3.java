package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inddepPractise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 15 (128 GB) - Black");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		String text=driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']/../../../../..//span[text()='61,400']")).getText();
		System.out.println(text);
		driver.close();
		
	}

}

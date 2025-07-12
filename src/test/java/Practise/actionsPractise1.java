package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsPractise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search/");
		WebElement ele=driver.findElement(By.linkText("MORE"));
		Thread.sleep(500);
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[text()='Counter Ticket Cancellation']")).click();
		Thread.sleep(500);
		driver.close();
		
		
		
		
		
		
		
	}

}

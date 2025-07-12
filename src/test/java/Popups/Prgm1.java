package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prgm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(1000);
		alert1.dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(1000);
		alert2.sendKeys("yes");
		Thread.sleep(1000);
		alert2.accept();
		driver.close();
		
		
		
		
	}

}

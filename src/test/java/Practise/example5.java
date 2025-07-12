package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		Alert apop=driver.switchTo().alert();
		System.out.println(apop.getText());
		apop.dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert();
		Thread.sleep(1000);
		apop.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert();
		apop.sendKeys("Selenium");
		Thread.sleep(1000);
		apop.accept();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}

package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("admin@gmail.com");
		Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(3000);
		email.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		email.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");
		System.out.println((driver.findElement(By.id("pass"))).getAttribute("value"));
		driver.close();
		
		

	}

}

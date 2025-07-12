package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locatorPractise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		By Email=By.id("email");
		WebElement Emailele=driver.findElement(Email);
		Emailele.sendKeys("admin");
		By Pwd=By.id("pass");
		WebElement ele2=driver.findElement(Pwd);
		ele2.sendKeys("password");
		driver.close();
		
		
		
		
		
		
	}

}

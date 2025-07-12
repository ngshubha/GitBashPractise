package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class emailfeildtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("admin@gmail.com");
		System.out.println(email.getAttribute("value"));
		driver.close();
		

	}

}

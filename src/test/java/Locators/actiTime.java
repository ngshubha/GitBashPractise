package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actiTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial ");
		String text=driver.findElement(By.xpath("//h1[contains(text(),'Start')]")).getText();
		System.out.println(text);
		driver.close();

	}

}

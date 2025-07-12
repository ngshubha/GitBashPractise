package Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipKart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> images=driver.findElements(By.tagName("img"));
		for(int i=0;i<images.size();i++)
		{
			System.out.println(images.get(i).getAttribute("src"));
		}
		driver.quit();
		
	
	}

}

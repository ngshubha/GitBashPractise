package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.abhibus.com/");
		String text=driver.findElement(By.cssSelector("h1[class='search-page-title']")).getText();
		System.out.println(text);
		driver.close();
		

	}

}

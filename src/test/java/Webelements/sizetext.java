package Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sizetext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for(int i=0;i<Links.size();i++)
		{
			WebElement rv=Links.get(i);
			System.out.println(rv.getText());
		}
			

	}

}

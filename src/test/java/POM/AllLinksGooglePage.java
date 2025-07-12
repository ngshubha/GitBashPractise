package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllLinksGooglePage {
	
	private List<WebElement> allLinks;
	
	public AllLinksGooglePage(WebDriver driver)
	{
		allLinks=driver.findElements(By.tagName("a"));
	}
	
	public void printLinks()
	{
		for(WebElement link:allLinks)
		{
			String text=link.getAttribute("href");
		}
	}
	
	
	}
	
	
	
	
	
	



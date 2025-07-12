package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClassPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement Drop = driver.findElement(By.id("drop1"));
		Select s=new Select(Drop);
		Boolean b=s.isMultiple();
		if(b)
		{
			System.out.println("Dropdown is multiple");
		}
		else
		{
			System.out.println("Dropdown is single");
		}
		List<WebElement> options = s.getOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		s.selectByIndex(1);
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		s.selectByValue("ghi");
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		s.selectByVisibleText("doc 4");
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(1000);
	
		driver.close();
		
		
		
		
		
	}

}

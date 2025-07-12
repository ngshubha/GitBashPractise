package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class chkmulsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement date=driver.findElement(By.id("day"));
		Select s=new Select(date);
		boolean msel=s.isMultiple();
		if(msel)
		{
			System.out.println("Date List Box is Multiselectable");
		}
		else
		{
			System.out.println("Date List Box is not multiselectable");
		}
		driver.close();
		}
		
		
		
		
		
		
	}



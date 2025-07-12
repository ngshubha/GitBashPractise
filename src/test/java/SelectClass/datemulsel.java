package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class datemulsel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement date=driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByValue("20");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2002");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}

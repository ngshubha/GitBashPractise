package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class prgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement mon=driver.findElement(By.id("month"));
		Select s=new Select(mon);
		System.out.println(s.getFirstSelectedOption().getText());
		driver.close();
		
		
		
	}

}

package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jsActiLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele1 = driver.findElement(By.id("FirstName"));
		WebElement ele2 = driver.findElement(By.id("LastName"));
		WebElement ele3 = driver.findElement(By.id("Email"));
		WebElement ele4=driver.findElement(By.id("Company"));
		WebElement ele5=driver.findElement(By.id("confirm-button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Admin';",ele1);
		js.executeScript("arguments[0].value='Admin';",ele2);
		js.executeScript("arguments[0].value='Admin@abc.com';",ele3);
		js.executeScript("arguments[0].value='Admin';",ele4);
		js.executeScript("arguments[0].click;",ele5);
		
		
		
		
		
		
		
		
		
	}

}

package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class prgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search/");
		Actions a =new Actions(driver);
		WebElement ele=driver.findElement(By.linkText("MORE"));
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[text()='Link Your Aadhaar']")).click();
		driver.close();
		
		
		
		
		
	}

}

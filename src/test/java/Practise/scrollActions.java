package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,-500)");
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//strong[text()='Featured products']"));
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		Thread.sleep(1000);
		driver.close();
		
	}

}

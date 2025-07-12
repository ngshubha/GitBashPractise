package Practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jsRefresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("history.go(0);");
		Thread.sleep(1000);
		
		
	}

}

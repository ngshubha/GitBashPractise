package Webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(10000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
		driver.close();


}
}
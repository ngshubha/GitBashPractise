package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		System.out.println(search.getAttribute("placeholder"));
		System.out.println("Before entering value in search feild  :"+search.getAttribute("Value"));
		search.sendKeys("iphones");
		System.out.println("After entering value in search feild :"+search.getAttribute("value"));
		driver.close();

	}

}

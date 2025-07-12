package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames ");
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		driver.switchTo().parentFrame();
		//driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText());
		

	}

}

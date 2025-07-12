package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class framepopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("singleframe");
		WebElement frame=driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		
		
		
	}

	}

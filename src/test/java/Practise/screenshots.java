package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("../Project1/Screenshots/scrsht1.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("Selenium");
		File src1=ele.getScreenshotAs(OutputType.FILE);
		File dest1=new File("../Project1/Screenshots/scrsht2.png");
		FileUtils.copyFile(src1, dest1);
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}

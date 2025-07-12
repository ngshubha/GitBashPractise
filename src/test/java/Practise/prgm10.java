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

public class prgm10 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("../Project1/Screenshots/prgm10.png");
		FileUtils.copyFile(src,dest);
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.id("email"));
		ele.sendKeys("admin");
		File src1=ele.getScreenshotAs(OutputType.FILE);
		File dest1=new File("../Project1/Screenshots/prgm10a.png");
		Thread.sleep(1000);
		FileUtils.copyFile(src1,dest1);
		driver.close();
		
		
		
	}

}

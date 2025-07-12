package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	@Test
	public void screenShot() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot shot=(TakesScreenshot) driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/Failed.png");
		FileUtils.copyFile(src, dest);
		driver.close();
		
		
		
		
	}

}

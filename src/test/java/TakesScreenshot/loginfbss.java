package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginfbss {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.name("login"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("../Project1/Screenshots/lbutton.png");
		FileUtils.copyFile(src,dest);
		driver.close();

	}

}

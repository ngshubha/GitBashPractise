package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prgm1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis=new FileInputStream("../Project1/data1.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		String URL=prop.getProperty("URL");
		String UN=prop.getProperty("Username");
		String Pass=prop.getProperty("password");
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(Pass);
		driver.findElement(By.name("login")).click();
		
				
		
		
		
		

	}

}

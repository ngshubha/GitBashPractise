package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com/");
		driver1.close();
		driver.close();
		
		
		
		
		
	}

}

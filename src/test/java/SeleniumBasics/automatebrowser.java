package SeleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automatebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().setSize(new Dimension (300,500));
		driver.manage().window().setPosition(new Point (180,300));
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.close();
		
		

	}

}

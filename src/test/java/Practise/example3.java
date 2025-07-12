package Practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().setSize(new Dimension(300,500));
		System.out.println("The height of the window is "+ driver.manage().window().getSize().getHeight());
		System.out.println("The width of the window is "+driver.manage().window().getSize().getWidth());
		driver.manage().window().setPosition(new Point(180,300));
		System.out.println("The X Coordinate is "+driver.manage().window().getPosition().x);
		System.out.println("The Y Coordinate is "+driver.manage().window().getPosition().y);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.close();
		
		
		
		
		

	}

}

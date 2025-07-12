package Practise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		String title=driver.getTitle();
		if(title.contains("Google"))
		{
			System.out.println("Google webpage is displayed");
		}
		else
		{
			System.out.println("Google webpage is not displayed");
		}
		driver.manage().window().setSize(new Dimension(500,400));
		driver.manage().window().setPosition(new Point(250,400));
		driver.manage().window().maximize();
		driver.navigate().forward();
		String title1=driver.getTitle();
		if(title1.contains("Facebook"))
		{
			System.out.println("Facebook webpage is displayed");
		}
		else
		{
			System.out.println("facebook webpage is not displayed");
		}
		driver.navigate().refresh();
		driver.close();
		}
		
		
		
		
		
	}



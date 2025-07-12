package SeleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateBrowser2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		if(driver.getTitle().equals("Google"))
				System.out.println("Google Page is displayed");
		else
				System.out.println("Google Page is not displayed");
		driver.manage().window().setSize(new Dimension(500,400));
		driver.manage().window().setPosition(new Point(250,400));
		driver.manage().window().maximize();
		driver.navigate().forward();
		if(driver.getTitle().contains("Facebook"))
			System.out.println("Facebook Page is displayed");
		else
			System.out.println("Facebook Page is not displayed");
		driver.navigate().refresh();
		driver.close();
		
		
				
		
	}

}

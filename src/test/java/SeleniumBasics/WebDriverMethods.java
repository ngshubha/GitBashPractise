package SeleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		
		driver.get("https://www.facebook.com/");
		System.out.println("Dimensions before maximising");
		Dimension Dim=driver.manage().window().getSize();
		System.out.println(Dim);
		System.out.println(Dim.getHeight());
		System.out.println(Dim.getWidth());
		driver.manage().window().maximize();
		System.out.println("Dimensions after maximising");
		Dimension Dim1=driver.manage().window().getSize();
		System.out.println(Dim1);
		System.out.println(Dim1.getHeight());
		System.out.println(Dim1.getWidth());
		
		
		driver.get("https://www.facebook.com/");
		System.out.println("Dimensions before setting the size");
		Dimension D1=driver.manage().window().getSize();
		System.out.println(D1);
		System.out.println(D1.getHeight());
		System.out.println(D1.getWidth());
		System.out.println("Dimensions after setting the size");
		driver.manage().window().setSize(new Dimension (500,500));
		Dimension D2=driver.manage().window().getSize();
		System.out.println(D2);
		System.out.println(D2.getHeight());
		System.out.println(D2.getWidth());
		
		Point Position= driver.manage().window().getPosition();
		System.out.println(Position);
		System.out.println("X Coordinate =" +Position.getX());
		System.out.println("X Coordinate =" +Position.getY());
		
		driver.manage().window().setPosition(new Point(300,300));
		Point P1= driver.manage().window().getPosition();
		System.out.println(P1);
		System.out.println("X Coordinate =" +P1.getX());
		System.out.println("X Coordinate =" +P1.getY());
		driver.close();
		
		
		
		
		
		
				
		
		
		
		
		
		
		
	}

}

package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		WebElement fname=driver.findElement(By.name("firstname"));
		WebElement sname=driver.findElement(By.name("lastname"));
		Point fnameloc=fname.getLocation();
		int fnamex=fname.getLocation().x;
		int fnamey=fname.getLocation().y;
		int snamex=sname.getLocation().x;
		int snamey=sname.getLocation().y;
		Point snameloc=sname.getLocation();
		System.out.println(fnamex+"  "+fnamey+"  "+snamex+"  "+snamey);
		if((fnamex==snamex) && (fnamey==snamey))
		{
			System.out.println("First name and surname feilds are aligned in same position");
		}
		else
		{
			System.out.println("Firstname and surname feilds are not aligned");
		}
		driver.close();
		
		
		
		
		
	}

}

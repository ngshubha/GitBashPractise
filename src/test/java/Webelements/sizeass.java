package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sizeass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		int emaillen=email.getSize().getWidth();
		WebElement pwd=driver.findElement(By.id("pass"));
		int pwdlen=email.getSize().getWidth();
		if(emaillen==pwdlen)
		{
			System.out.println("Email and password feilds are of samelength" +emaillen +"    "+ pwdlen);
		}
		else
		{
			System.out.println("Email and password feilds are of different length");
		}
		
		driver.close();

	}

}

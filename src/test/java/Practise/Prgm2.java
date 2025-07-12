package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		WebElement Pwd=driver.findElement(By.id("pass"));
		int emaillen = email.getSize().getWidth();
		int pwdlen = Pwd.getSize().getWidth();
		if(emaillen==pwdlen)
		{
			System.out.println("The email and password lengths are the same "+emaillen);
		}
		else
		{
			System.out.println("The email and password lengths are different "+pwdlen + emaillen);
		}
		driver.close();
		
		
		
		
		
	}

}

package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.cssSelector("input[id='ap_email_login']")).sendKeys("adbc@gmail.com");
		driver.findElement(By.cssSelector("input[class='a-button-input']")).click();
		driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='signInSubmit']")).click();
		driver.close();
		
		
		
		
		
		
		
	}

}

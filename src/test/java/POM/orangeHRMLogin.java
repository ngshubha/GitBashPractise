package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class orangeHRMLogin {

	private WebElement uname;
	private WebElement pass;
	private WebElement lButton;
	
	public orangeHRMLogin(WebDriver driver)
	{
		uname=driver.findElement(By.name("username"));
		pass=driver.findElement(By.name("password"));
		lButton=driver.findElement(By.xpath("//button[text()=' Login ']"));
	}
	
	public void enteremail(String username)
	{
		uname.sendKeys(username);
	}
	public void enterpass(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void clicklogin()
	{
		lButton.click();
	}
	
	
	
	
	
	
	
	
	
}

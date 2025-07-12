package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class faceBookLogin {
	
	private WebElement Email;
	private WebElement Pass;
	private WebElement loginButton;
	
	public faceBookLogin(WebDriver driver)
	{
		Email=driver.findElement(By.id("email"));
		Pass=driver.findElement(By.id("pass"));
		loginButton=driver.findElement(By.name("login"));
	}
	
	public void enteremail(String emailid)
	{
		Email.sendKeys(emailid);
	}
	public void enterpass(String pwd)
	{
		Pass.sendKeys(pwd);
	}
	public void clicklogin()
	{
		loginButton.click();
	}
	
	
	
}

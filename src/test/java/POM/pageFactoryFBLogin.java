package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactoryFBLogin {
	
	@FindBy(id="email")
	private WebElement Email;
	@FindBy(id="pass")
	private WebElement Pass;
	@FindBy(name="login")
	private WebElement lButton;
	
	public pageFactoryFBLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
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
		lButton.click();
	}
	
	

}

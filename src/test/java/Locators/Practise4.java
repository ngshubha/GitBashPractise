package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		By ele=By.id("nav-link-accountList-nav-line-1");
		WebElement sele=driver.findElement(ele);
		sele.click();
		By ele1=By.id("createAccountSubmit");
		WebElement sele1=driver.findElement(ele1);
		sele1.click();
		By ele3=By.id("ap_email_login");
		WebElement sele3=driver.findElement(ele3);
		sele3.sendKeys("123456");
		/*By ele4=By.className("a-button-input");
		WebElement sele4=driver.findElement(ele4);
		sele4.click();
		By ele5=By.id("ap_password");
		WebElement sele5=driver.findElement(ele5);
		sele5.sendKeys("pass");
		By ele6=By.className("a-button-input");
		WebElement sele6=driver.findElement(ele6);
		sele6.click();
		driver.close();*/
		
			
		
		
		

	}

}

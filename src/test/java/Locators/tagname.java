package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		By sbox=By.id("twotabsearchtextbox");
		WebElement ele=driver.findElement(sbox);
		ele.sendKeys("iphone");
		By sbutton=By.id("nav-search-submit-button");
		WebElement ele1=driver.findElement(sbutton);
		ele1.click();
		driver.close();

	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		By ele1=By.className("Pke_EE");
		WebElement sbar=driver.findElement(ele1);
		sbar.sendKeys("Mobiles");
		By ele2=By.className("_2iLD__");
		WebElement sbutton=driver.findElement(ele2);
		sbutton.click();
		driver.close();
		
		

	}

}

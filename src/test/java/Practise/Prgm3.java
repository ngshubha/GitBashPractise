package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.xpath("//a[contains(@id,'u_0_6')]"));
		System.out.println("The tagname is " + link.getTagName());
		System.out.println("The attribute value of href is "+link.getAttribute("href"));
		System.out.println("The visible text is "+link.getText());
		driver.close();
		
		
		
	}

}

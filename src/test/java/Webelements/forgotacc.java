package Webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class forgotacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		WebElement flink=driver.findElement(By.linkText("Forgotten password?"));
		System.out.println("The tagname is "+ flink.getTagName());
		System.out.println("The attribute value of id is"+flink.getAttribute("id"));
		System.out.println("The text is "+flink.getText());
		driver.close();
		
	}

}

package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='admin'");
		WebElement name=driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].value='admin';",name);
		WebElement button=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();",button);
		
		

	}

}

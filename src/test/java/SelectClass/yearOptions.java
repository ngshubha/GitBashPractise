package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class yearOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement year=driver.findElement(By.id("year"));
		Select s=new Select(year);
		List<WebElement> yearlist=s.getOptions();
		int count=yearlist.size();
		System.out.println("Total number of options present in year list box is " +count);
		driver.close();
		
		
	}

}

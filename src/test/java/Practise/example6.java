package Practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		Set<String> title = driver.getWindowHandles();
		Thread.sleep(1000);
		Iterator <String> itr=title.iterator();
		while(itr.hasNext())
		{
		
			String ref=itr.next();
			driver.switchTo().window(ref);
			System.out.println(driver.getTitle());
			
		}
		
		driver.quit();
	}

}

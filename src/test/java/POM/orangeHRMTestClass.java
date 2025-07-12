package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orangeHRMTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		orangeHRMLogin ol=new orangeHRMLogin(driver);
		ol.enteremail("Admin");
		ol.enterpass("admin123");
		ol.clicklogin();
		driver.close();
		

	}

}

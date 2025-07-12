package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageFactoryFBLoginTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		faceBookLogin fb=new faceBookLogin(driver);
		fb.enteremail("admin@gmail.com");
		fb.enterpass("password");
		fb.clicklogin();
		driver.close();

	}

}

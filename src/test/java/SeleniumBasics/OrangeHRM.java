package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// Write a test script to verify OrangeHRM login page is displayed or not
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("OrangeHRM"))
			System.out.println("Orange HRM page is displayed");
		else
			System.out.println("The page is not dispalyed");
		
		driver.close();

	}

}

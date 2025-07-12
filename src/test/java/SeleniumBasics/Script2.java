package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) {
		
		//Write a test script to display title and URL of Amazon.in as an output
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}

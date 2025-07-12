package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {
	
	public static void main (String[] args)
	{
		/* Write a script to perform the following actions 1. Open the Chrome Browser 2. Open Facebook App 
		 * 3. Open the Google application in the same window 4. close the window */
		
		System.setProperty("www.chrome.driver","C:\\chrome-win64");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.get("https://www.google.com/");
		driver.close();

	}
}

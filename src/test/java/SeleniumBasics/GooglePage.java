package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		if(title.equals("Google"))
			System.out.println("Google page is dispalyed");
		else
			System.out.println("Google page is not dispalyed");
		driver.close();
		
		
		
	}

}

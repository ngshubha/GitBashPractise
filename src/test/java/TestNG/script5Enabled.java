package TestNG;

import org.testng.annotations.Test;

public class script5Enabled {
	
	@Test(enabled=false)
	public void createAccount()
	{
		System.out.println("Create Account");
	}

}

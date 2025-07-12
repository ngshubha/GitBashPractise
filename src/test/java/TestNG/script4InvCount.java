package TestNG;

import org.testng.annotations.Test;

public class script4InvCount {
	
	@Test(invocationCount=3)
	public void createAcc()
	{
		System.out.println("Create Account");
	}

}

package TestNG;

import org.testng.annotations.Test;

public class script3Priority {
	
	@Test(priority=0)
	public void createAcc()
	{
		System.out.println("Create Account");
	}
	@Test(priority=1)
	public void editAcc()
	{
		System.out.println("Edit Account");
	}
	@Test(priority=2)
	public void delAcc()
	{
		System.out.println("Delete Account");
	}

}

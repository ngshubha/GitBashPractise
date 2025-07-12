package TestNG;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test
	public void createAccount()
	{
		System.out.println("Account is created");
	}
	
	@Test(dependsOnMethods="createAccount")
	public void modifyAccount()
	{
		System.out.println("Account is modified");
	}
	
	@Test(dependsOnMethods="createAccount")
	public void deleteAccount()
	{
		System.out.println("Account is deleted");
	}
	
	
	

}

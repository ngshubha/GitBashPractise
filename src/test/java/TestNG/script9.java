package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class script9 {
	
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login to the Application");
	}
	
	@Test
	public void adduser()
	{
		System.out.println("User Added");
	}

	@Test
	public void modifyUser()
	{
		System.out.println("User detailes modified");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("User details deleted");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logged out of the application");
	}
}

package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	@BeforeClass
	public void Preconditions()
	{
		System.out.println("Open the Browser");
	}
	
	@AfterClass
	public void Postconditions()
	{
		System.out.println("close the Browser");
	}
	
	

}

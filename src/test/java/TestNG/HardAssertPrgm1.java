package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertPrgm1 {
	
	@Test
	public void Test1()
	{
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		Assert.assertEquals(true, true);
		System.out.println("Step 4");
		System.out.println("Step 5");
		System.out.println("Step 6");
		
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Qspiders");
		System.out.println("Qspider");
		Assert.assertEquals("QSpiders","Qspider");
		System.out.println("QspidersTesting");
		
	}

}

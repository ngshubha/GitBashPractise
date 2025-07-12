package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script1 {
	
	
	@Test
	public void test1()
	{
		//System.out.println("Hello");
		//Reporter.log("Hello");
		Reporter.log("Hello",true);
	}

}

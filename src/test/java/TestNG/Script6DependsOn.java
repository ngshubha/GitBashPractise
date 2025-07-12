package TestNG;

import org.testng.annotations.Test;

public class Script6DependsOn {
	
	@Test
	public void addContact()
	{
		System.out.println("Contact Added");
	}
	
	@Test(dependsOnMethods="addContact")
	public void startChat()
	{
		System.out.println("Started Chatting");
	}

}

package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClassPractise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement mdropdown=driver.findElement(By.id("multiselect1"));
		Select msel=new Select(mdropdown);
		Boolean b=msel.isMultiple();
		if(b)
		{
			System.out.println("Dropdwon is multiselect");
		}
		else
		{
			System.out.println("Dropdown is not multiselect");
		}
		List<WebElement> oplist = msel.getOptions();
		System.out.println("The options in the dropdown are");
		for(WebElement opt:oplist)
		{
			System.out.println(opt.getText());
		}
		for(int i=0;i<oplist.size();i++)
		{
			msel.selectByIndex(i);
		}
		List<WebElement> list=msel.getAllSelectedOptions();
		for(WebElement optl:list)
		{
			System.out.println(optl.getText());
		}
		for(int i=0;i<oplist.size();i++)
		{
			msel.deselectByIndex(i);
		}
		
		
		
		
		
		
		
		
		
		
	}

}

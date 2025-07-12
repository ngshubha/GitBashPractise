package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www2.fatcow.com/");
		WebElement csel=driver.findElement(By.id("countrySelect"));
		Select s=new Select(csel);
		List<WebElement> options=s.getOptions();
		for(WebElement op:options)
		{
			String con="Australia";
			if(op.getText().matches(con))
			{
				op.click();
			}
		}
			
				
		}
		
		
		
		

	}



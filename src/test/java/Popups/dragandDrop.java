package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/ ");
		driver.switchTo().frame(0);
		WebElement ele1=driver.findElement(By.id("draggable"));
		WebElement ele2=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1,ele2).perform();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}

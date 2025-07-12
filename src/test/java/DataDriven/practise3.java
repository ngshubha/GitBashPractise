package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practise3 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Workbook book=WorkbookFactory.create(new FileInputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Book.xlsx"));
		driver.findElement(By.id("email")).sendKeys(book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		driver.findElement(By.id("pass")).sendKeys(book.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.close();
		
		
	}

}

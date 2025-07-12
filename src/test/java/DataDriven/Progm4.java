package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Progm4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
				FileInputStream fis=new FileInputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Book.xlsx");
				Workbook book=WorkbookFactory.create(fis);
				Sheet sheet=book.getSheet("Sheet1");
				
			
				String URL=sheet.getRow(0).getCell(0).getStringCellValue();
				String UN=sheet.getRow(1).getCell(0).getStringCellValue();
				String Pass=sheet.getRow(2).getCell(0).getStringCellValue();
				
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(URL);
				driver.findElement(By.id("email")).sendKeys(UN);
				driver.findElement(By.id("pass")).sendKeys(Pass);
				driver.findElement(By.name("login")).click();
				
				

	}

}

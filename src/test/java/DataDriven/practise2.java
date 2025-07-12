package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practise2 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Workbook Book=WorkbookFactory.create(new FileInputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Book.xlsx"));
		//Book.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Selenium");
		Book.createSheet("Practise").createRow(1).createCell(0).setCellValue("TCS");
		FileOutputStream out=new FileOutputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\Book.xlsx");
		Book.write(out);
		
	}

}

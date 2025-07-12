package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		String path="C:\\Users\\shubh\\OneDrive\\Desktop\\Book.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(file);
		org.apache.poi.ss.usermodel.Sheet s = book.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String data =c.getStringCellValue();
		System.out.println(data);
		
	}

}

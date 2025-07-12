package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Prgm2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();
		prop.setProperty("URL1", "https://www.gmail.com");
		FileOutputStream fos=new FileOutputStream("../Project1/data2.properties");
		prop.store(fos, "Data Added");
		

	}

}

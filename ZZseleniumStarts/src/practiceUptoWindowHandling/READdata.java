package practiceUptoWindowHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.binary.XSSFBSheetHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class READdata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		
		String path=System.getProperty("user.dir")+"\\ex1\\Book1.xlsx";
	File destination=new File(path);
	FileInputStream fis=new FileInputStream(destination);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh1=wb.getSheetAt(0);
String value	=sh1.getRow(6).getCell(1).getStringCellValue();
	System.out.println(value);
	
	
	
		
	}

}
package ExcelHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class method {

	public static String readData(int row,int column) throws Throwable {
		String path=System.getProperty("user.dir")+"\\ex1\\Book1.xlsx";
File src=new File(path); 
FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh1=wb.getSheetAt(0);
//XSSFSheet sh1=wb.getSheet("Sheet1");
String value=sh1.getRow(row).getCell(column).getStringCellValue();
System.out.println(value);
return value;

	}


public static void writeData(int row,int column) throws Throwable{
String path =System.getProperty("user.dir")+"\\ex1\\Book1.xlsx";
File src=new File(path);
FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh1=wb.getSheetAt(0);

File fout=new File(path);
FileOutputStream fo=new FileOutputStream(fout);

//sh1.getRow(row).getCell(column).setCellValue("writeAtouter operation");
sh1.getRow(row).getCell(column).setCellValue("boss1");

wb.write(fo);


	}

}

package ZZZZsundaypracticeSelenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class methods {

	public static void write(int row,int col) throws Throwable {
		 String path="C:\\Users\\akshay\\Desktop\\pr1.xlsx";
		  File F=new File(path);
		  FileInputStream fis=new FileInputStream(F);
		  XSSFWorkbook wb= new XSSFWorkbook(fis) ;
		  XSSFSheet sh1=wb.getSheetAt(0);
		  
		  File fout=new File(path);
		 FileOutputStream foi=new FileOutputStream(fout);
		sh1.createRow(row).createCell(col).setCellValue("AKSHay");
		 //sh1.getRow(12).createCell(1).setCellValue("oks1");
		  wb.write(foi);
	}
	
public static String m2(int row,int col) throws Throwable {
	String path =System.getProperty("user.dir")+ "\\ex1\\pr1.xlsx";
	File src = new File(path);
   FileInputStream fis=new FileInputStream(src);
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet sh1=wb.getSheetAt(0);
   
   DataFormatter df=new DataFormatter();
       String value = df.formatCellValue(sh1.getRow(row).getCell(col));
       System.out.println(value);
	
       return value;
	
}
	
	
	
	
		
	
	public static void main(String[] args) throws Throwable {
		//write(12,1);
		write(1,1);
		m2(0,0);
	}

}
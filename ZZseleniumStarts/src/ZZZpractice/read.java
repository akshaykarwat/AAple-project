package ZZZpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {
	            //string
	public static String read(int row,int col) throws Throwable {
		String path=System.getProperty("user.dir")+"\\boss\\boss.xlsx";
		File src=new File(path);
		FileInputStream fi=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh1=wb.getSheetAt(0);
		
		 //String value=sh1.getRow(row).getCell(col).getStringCellValue();
	//	System.out.println(value);
		
		DataFormatter df=new DataFormatter();
		 String value=df.formatCellValue(sh1.getRow(row).getCell(row));
		 System.out.println(value);
		 
		
		return value;
		 
	}
	public static void write(int row,int col) throws Throwable {
		String path=System.getProperty("user.dir")+"\\boss\\boss.xlsx";
		File src=new File(path);
		FileInputStream fi=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh1=wb.getSheetAt(0);
	
		File fout=new File(path);
		FileOutputStream fos=new FileOutputStream(fout);
		sh1.getRow(1).getCell(0).setCellValue("hello india");
		sh1.createRow(12).createCell(0).setCellValue("he kel row");
	  sh1.getRow(12).createCell(1).setCellValue("he column");
		wb.write(fos);
		
	}
	
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		write(5,1);
		read(0,1);
		//read(1,1);
		read(1,2);
		read(1,3);
		//1 column row
		
		
	}

}

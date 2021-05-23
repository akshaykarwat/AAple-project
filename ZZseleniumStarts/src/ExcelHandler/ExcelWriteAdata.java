package ExcelHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteAdata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		String path =System.getProperty("user.dir")+"\\ex1\\Book1.xlsx";
		File src=new File(path);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(0);
		
		File fout=new File(path);
		FileOutputStream fo=new FileOutputStream(fout);
		
		sh1.getRow(0).getCell(0).setCellValue("AKSHAY");
		//to writeAtouter in a row
		sh1.createRow(12).createCell(0).setCellValue("i am here");
		//to writeAtouter on colunmn
		sh1.createRow(10).createCell(0).setCellValue("i am here");
		sh1.getRow(10).createCell(1).setCellValue("boss");
		wb.write(fo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

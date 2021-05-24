package ZZZZsundaypracticeSelenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeAtouter {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
  String path="C:\\Users\\akshay\\Desktop\\pr1.xlsx";
  File F=new File(path);
  FileInputStream fis=new FileInputStream(F);
  XSSFWorkbook wb= new XSSFWorkbook(fis) ;
  XSSFSheet sh1=wb.getSheet("Sheet2");
  
  File fout=new File(path);
 FileOutputStream foi=new FileOutputStream(fout);
 sh1.createRow(12).createCell(0).setCellValue("oks");
 
 sh1.getRow(12).createCell(1).setCellValue("oks1");
  
  wb.write(foi);
		
		
	}

}

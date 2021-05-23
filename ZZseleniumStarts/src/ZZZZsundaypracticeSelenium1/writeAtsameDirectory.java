package ZZZZsundaypracticeSelenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeAtsameDirectory {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	String path=System.getProperty("user.dir")+"\\ex1\\pr1.xlsx";
	File F =new File(path);
	FileInputStream fi=new FileInputStream(F);
   XSSFWorkbook wb=new XSSFWorkbook(fi);
   XSSFSheet Sh1=wb.getSheetAt(0);
     
    File fout=new File(path);
    FileOutputStream fos=new FileOutputStream(fout);
    Sh1.getRow(0).getCell(0).setCellValue("akshay");
    Sh1.createRow(9).createCell(0).setCellValue("hmm");
    Sh1.getRow(9).createCell(1).setCellValue("hmm1");
wb.write(fos);
	
		
	}

}

package ExccelToReadAlltypeOfData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.io.FileHandler;

public class DATaformator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		String path=System.getProperty("user.dir")+"\\ex1\\Book1.xlsx";
		File src= new File(path);
     FileInputStream fi=new FileInputStream(src);
    
     XSSFWorkbook wb=new XSSFWorkbook(fi);
     XSSFSheet sh1=wb.getSheetAt(0);
     int rowcount= sh1.getLastRowNum();
     int columncount=sh1.getRow(0).getLastCellNum();
     
   System.out.println("rows are:"+rowcount);
   System.out.println("colums are:"+columncount);
   //TO PRINT ANY TYPE OF DATA FROM EXCEL SHEET
   DataFormatter df=new DataFormatter();
   String Formatted=df.formatCellValue(sh1.getRow(6).getCell(0));
   //string value=sh1.getrow(0).getcell(0).getstringcellvalue();
   //yan fakt string hot hota handle
   System.out.println(Formatted);

   DataFormatter df1=new DataFormatter();
   String Formatted1=df.formatCellValue(sh1.getRow(8).getCell(1));
   System.out.println(Formatted1);



		
		
		
		
		
		
		
		
	}

}

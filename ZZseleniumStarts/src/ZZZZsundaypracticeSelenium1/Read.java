package ZZZZsundaypracticeSelenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\akshay\\Desktop\\pr1.xlsx";
		File src = new File(path);

		FileInputStream fi = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh1 = wb.getSheetAt(0);
DataFormatter df= new DataFormatter();
 String v1=df.formatCellValue(sh1.getRow(0).getCell(0));
 System.out.println(v1);

	}

}

package ZZZpractice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class gamil {
	public static String read(int row,int col) throws Throwable {
		String path=System.getProperty("user.dir")+"\\boss\\gmail.xlsx";
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

}
}
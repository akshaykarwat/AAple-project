package ExcelHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelREADdata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();

String path=System.getProperty("user.dir")+"\\ex1\\Book1.xlsx";
//                                               book1 extension added

File src=new File(path); 

FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sh1=wb.getSheetAt(0);
//XSSFSheet sh1=wb.getSheet("Sheet1");
String value=sh1.getRow(0).getCell(0).getStringCellValue();
System.out.println(value);

	}

}

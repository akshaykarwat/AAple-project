package scrrenshot2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ssCpature {
	
	
	
	public static void capturing( WebDriver driver, String filename ) throws Throwable {
		 TakesScreenshot src = (TakesScreenshot)driver;
	     File source = src.getScreenshotAs(OutputType.FILE);
	     
	     File destination = new File ("C:\\Users\\akshay\\Desktop\\akshay\\"+filename+".png");
	     
  FileHandler.copy(source, destination);

	
  
	}
  
  
  
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
			
			
			
			
		}
	

}

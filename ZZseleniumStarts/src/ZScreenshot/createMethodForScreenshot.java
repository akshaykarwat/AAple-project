package ZScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class createMethodForScreenshot {
	
	
	
	
	public static void capture( WebDriver driver, String filename) throws Throwable {
	
	TakesScreenshot screenshot = (TakesScreenshot) driver;

	File source = screenshot.getScreenshotAs(OutputType.FILE);
	
	File destination=new File("C:\\Users\\akshay\\Desktop\\akshay\\"+filename+".png");
	
	
	FileHandler.copy(source, destination);
	}

	
	public static void iNSideofclass( WebDriver driver,String filename) throws Throwable {
		
		          TakesScreenshot scrc = (TakesScreenshot)driver;
		          
		         File source = scrc.getScreenshotAs(OutputType.FILE);
		         
		         File destination =new File("C:\\Users\\akshay\\git\\akshay\\ZZseleniumStarts\\SsScreenshot\\"+filename+".png");
		          
		         
		         FileHandler.copy(source, destination);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
	}

}

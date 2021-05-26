package zzzzpractice11111;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrrenshot_User_Directly {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		      TakesScreenshot src =(TakesScreenshot)driver;
		    File F = src.getScreenshotAs(OutputType.FILE);
		    
		    File Destination= new File (System.getProperty("user.dir")+"\\ex1\\google.png");
		           
		FileHandler.copy(F, Destination);
		
		
		
		
	}

}

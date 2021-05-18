package Screnshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShotNormal {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();
		
		     TakesScreenshot src = (TakesScreenshot)driver;
		     File source = src.getScreenshotAs(OutputType.FILE);
		     
		     File destination = new File ("C:\\Users\\akshay\\Desktop\\akshay\\clickByme.png");
		     
	   FileHandler.copy(source, destination);
	
	}

	
	}



package Testng4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class baseclass {

	static WebDriver driver;
	@BeforeSuite
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
	 driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	
	@AfterSuite
	public void closeBrowser() {
	
	driver.quit();
	}
	
	
	
	
	}



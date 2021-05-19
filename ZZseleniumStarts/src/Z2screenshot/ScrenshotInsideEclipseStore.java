package Z2screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ZScreenshot.createMethodForScreenshot;

public class ScrenshotInsideEclipseStore {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
	
		
		createMethodForScreenshot.iNSideofclass(driver, "baburaoBoltoy");
	}

}

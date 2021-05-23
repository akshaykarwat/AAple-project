package ZZZZsundaypracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class toSaveinSameDirectly {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		 TakesScreenshot src=(TakesScreenshot)driver;
		 File source=src.getScreenshotAs(OutputType.FILE);
		 File destination=new File(System.getProperty("user.dir")+"\\SsScreenshot\\Q1.png");
		FileHandler.copy(source, destination);
		
	}

}

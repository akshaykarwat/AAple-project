package ZZZZsundaypracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class meTHods {

	public static void m1(WebDriver driver) throws Throwable {

		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\akshay\\Desktop\\akshay\\Q11.png");
		FileHandler.copy(source, destination);
	}

	public static void m3(WebDriver driver, String filename) throws Throwable {

		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\akshay\\git\\akshay\\ZZseleniumStarts\\SsScreenshot\\" + filename + ".png");
		FileHandler.copy(source, destination);

	}

	public static void m2(WebDriver driver, String filename) throws Throwable {

		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\SsScreenshot\\" + filename + ".png");
		FileHandler.copy(source, destination);

	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		m1(driver);
		m3(driver, "akshay122");
		m2(driver, "1233");

	}

}

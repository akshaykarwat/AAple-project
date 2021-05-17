package practiceUptoWindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class doubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement one = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		one.sendKeys("Admin");

		WebElement two = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		two.sendKeys("admin123");

		WebElement three = driver.findElement(By.xpath("//*[@id='btnLogin']"));
		three.click();
		driver.findElement(By.linkText("Admin")).click();
		
		WebElement four = driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_11\"]"));
		
		
		    JavascriptExecutor js =(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click();",four);

	}

}

package SCROLLING;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingUPtoLImit {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit' or @id='btn']")).click();

		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_23']"));
                   JavascriptExecutor js = (JavascriptExecutor)driver;
                   js.executeScript("arguments[0].scrollIntoView();", checkbox);
                   Thread.sleep(2000);
                   checkbox.click();
                   
		
	}

}

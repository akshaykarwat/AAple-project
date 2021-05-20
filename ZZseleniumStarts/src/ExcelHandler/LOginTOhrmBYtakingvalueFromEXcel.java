package ExcelHandler;

import org.apache.commons.math3.analysis.function.Expm1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LOginTOhrmBYtakingvalueFromEXcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(method.readData(1, 0));
		

		 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(method.readData(0, 1));
		

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
		
		
		
		
	}

}

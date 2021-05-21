package FileRandom;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ExcelHandler.method;

public class loginBYconfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Properties prop=new Properties();
		driver.get(prop.getProperty("testsiteurl"));

		 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(prop.getProperty("username"));
		

		 driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(prop.getProperty("password"));
		

		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}

}

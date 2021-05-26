package zzzzpractice11111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement ok1=	driver.findElement(By.xpath("//*[text()='Click Me']"));
	ok1.click();
	
	
	String value =driver.switchTo().alert().getText();
	System.out.println(value);
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().getText();
		
		
		
	}

}

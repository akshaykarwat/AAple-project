package zzzzpractice11111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DOble_contex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//WebElement frame = driver.findElement(By.xpath("//*[@id=\"frame-one1434677811\"]"));
		//driver.switchTo().frame(frame);

		Actions act= new Actions(driver);
		WebElement two = driver.findElement(By.xpath("//*[text()='Copy Text']"));
		act.doubleClick(two).perform();
		
		
	}

}

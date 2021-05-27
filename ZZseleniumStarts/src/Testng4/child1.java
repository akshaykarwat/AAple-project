package Testng4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class child1 extends baseclass  {
	
	
	
	@BeforeTest
	public void login() {
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("admin123");

		WebElement submit =driver.findElement(By.name("Submit"));
		submit.click();
	}
	@AfterTest
	public void clickonsomething() {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	}
	
	
	

}

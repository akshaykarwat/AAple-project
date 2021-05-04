package secondDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRm {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
WebElement username=driver.findElement(By.id("txtUsername"));
username.sendKeys("Admin");

WebElement Password=driver.findElement(By.id("txtPassword"));
Password.sendKeys("admin123");

WebElement submit =driver.findElement(By.name("Submit"));
Thread.sleep(10000);
submit.click();
driver.close();



	}

}

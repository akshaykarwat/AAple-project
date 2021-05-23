package ZZZpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginwithRAndomFb {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(read.read(0, 0));

		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys(read.read(0,1));

		WebElement submit = driver.findElement(By.name("Submit"));
		
		submit.click();
		

	}

}

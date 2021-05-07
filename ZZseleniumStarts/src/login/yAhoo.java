package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yAhoo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("ankit.007@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("Pratik@1234");
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		
	}

}

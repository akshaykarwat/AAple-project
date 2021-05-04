package FristDay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iNstagram {

	public static void main(String[] args) {
		// TODO Auto-generated method s		tub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys(" ");
	driver.findElement(By.id("pass")).sendKeys(" ");
	driver.findElement(By.name("login")).click();
		
	}

}

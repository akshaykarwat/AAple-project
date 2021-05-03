package FristDay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.name("email")).sendKeys("9588615643");
driver.findElement(By.name("pass")).sendKeys("@Akshay10");
		driver.findElement(By.name("login")).click();
	}

}

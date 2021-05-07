package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("akshaykarwatkar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='yDmH0d']")).click();
		Thread.sleep(2000);
	}

}

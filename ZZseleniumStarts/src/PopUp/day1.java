package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		
		
		driver.switchTo().alert().accept();
		///driver.switchTo().alert().dismiss();

	}

}

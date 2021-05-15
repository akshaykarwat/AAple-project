package sundaypRactice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		driver.findElement(By.linkText("PIM")).click();
		
		Select  dropdown = new Select(driver.findElement(By.xpath("//*[@id='empsearch_job_title']")));
		//dropdown.selectByIndex(1);
		//dropdown.selectByValue("22");
		dropdown.selectByVisibleText("Chief Executive Officer");
	}

}

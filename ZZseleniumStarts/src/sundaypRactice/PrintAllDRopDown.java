package sundaypRactice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDRopDown {

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
		
		
		List<WebElement> options = driver.findElements(By.xpath("(//*[@id='empsearch_job_title'])//option"));
		for(  WebElement opt :options) {
			String xx = opt.getText();
			System.out.println(xx);
			if(xx.equals("Financial Analyst")) {
			opt.click();
			}
		}
	}
	
}

package dropdownDay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangedroprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit' or @id='btn']")).click();

		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		 List<WebElement> print = driver.findElements(By.xpath("//*[@id='empsearch_sub_unit']//option"));
		 for(  WebElement sss  :print) {
			String xx = sss.getText();
			System.out.println(xx);
			if(xx.equals("Quality Assurance"));
			sss.click();
		 }
	}

}

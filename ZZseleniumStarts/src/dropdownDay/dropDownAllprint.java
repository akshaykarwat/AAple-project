package dropdownDay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownAllprint {

	public static void main(String[] args) throws InterruptedException {
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
		// take another click and //option selected
		List<WebElement> ooks = driver.findElements(By.xpath("//*[@id='empsearch_job_title']//option"));
		 for(WebElement xx:ooks) {
			 System.out.println(xx.getText());
			System.out.println(xx);
			
			Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"empsearch_job_title\"]")));
			dropdown.selectByIndex(1);
			}
		}

	}




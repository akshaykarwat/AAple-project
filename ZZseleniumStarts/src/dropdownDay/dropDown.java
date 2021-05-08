package dropdownDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dAY3tagNameAssighnment.dropdown;

public class dropDown {

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

		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		
		WebElement Title=driver.findElement(By.xpath("//*[@ name='empsearch[job_title]']"));
		Select dropdown=new Select(Title);
		dropdown.selectByIndex(1);
		
	WebElement subset = driver.findElement(By.xpath("//*[@id='empsearch_sub_unit']"));
	Select sttring =new Select(subset);
sttring.selectByValue("5");

          WebElement third = driver.findElement(By.xpath("//*[@id='empsearch_termination']"));
		Select X=new Select(third);
		X.selectByVisibleText("Current and Past Employees");
	}

}

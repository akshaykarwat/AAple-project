package dAY3tagNameAssighnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lOginCRendesntiL {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
		 String actual=driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
		 String expected ="is op";
		 System.out.println(actual.equals(expected));
		
		
	}

}

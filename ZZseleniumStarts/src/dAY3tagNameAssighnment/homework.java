package dAY3tagNameAssighnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework  {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		driver.navigate().refresh();
		
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("");
		driver.findElement(By.className("button")).click();
		
		//PASSWORD NAI GHETLA
	 String actual=driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
	
		String expected=" i am matching";
		 
		System.out.println(actual.equals(expected));
		
		if(actual.equals(expected)) {
			System.out.println("test case is pass");
		}else {
			System.out.println("test case is fail ");
		}
		
		 
		
	}

}

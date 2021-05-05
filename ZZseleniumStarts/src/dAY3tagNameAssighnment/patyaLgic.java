package dAY3tagNameAssighnment;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class patyaLgic {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		driver.navigate().refresh();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		try {
		String actual=driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
		
		String expected="Username cannot be empty";
		
if(actual.equals(expected)) {
	System.out.println(" invalid user name");
}else {
	System.out.println(actual);
}
}catch(Exception e){
	System.out.println("login succesfully");
}
	}

}

package Windohandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreThanTwohandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

//		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//input[@name='Submit' or @id='btn']")).click();
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
//		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
//		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();


		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		 Set<String> child = driver.getWindowHandles();
		 System.out.println(child);
		 for( String ss : child ) {
			 if(!(parent.equals(ss))){
				 driver.switchTo().window(ss);
				 driver.navigate().to("https://www.flipkart.com");
				 
//		Child mdhi flipkcart			 }
			 driver.switchTo().defaultContent();
			 driver.switchTo().window(parent);
		 driver.navigate().to("https://www.facebook.com");
			 //parent vr facebook
			
		 }

	}

	}
}

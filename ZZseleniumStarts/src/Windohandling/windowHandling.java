package Windohandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

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

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		String parentId = driver.getWindowHandle();//gives parentID
		System.out.println(parentId);

		Set<String> parentChild = driver.getWindowHandles();
		System.out.println(parentChild);
		for (String bothprint : parentChild) {
			System.out.println(bothprint);
			if (!(parentId.equals(bothprint))) {
				driver.switchTo().window(bothprint);//for child
				driver.navigate().to(" https://www.google.com");
			}
			 driver.switchTo().window(parentId);//for parent
			
			// driver.switchTo().defaultContent();
		}
	}

}

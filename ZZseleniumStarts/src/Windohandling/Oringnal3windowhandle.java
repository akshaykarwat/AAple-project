package Windohandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oringnal3windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
String parent =driver.getWindowHandle();
System.out.println(parent);
		
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
 
		Set<String> moreHandles = driver.getWindowHandles();
		
		int count = moreHandles.size();
		String winid[] = new String[count];
		
		int i=0;
		for(  String id :moreHandles ) {
			winid[i]=id;
			i++;
		}
driver.switchTo().window(winid[1]);
driver.findElement(By.xpath("//*[@class='demo-btn home-btn trial-btn pulse']")).click();
	}
	

}

package Windohandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneParentTwoCHild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		String parentIddd = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();



		
	   Set<String> allID = driver.getWindowHandles();
		    int storePC =allID.size();
		    System.out.println(allID);
		    
		String[ ]ss=new String[storePC];
		int i=0;
	for(   String id   :allID ) {
		ss[i]=id;
		i++;
		
	}
	//O ZERO MEANS PAREnt calling
driver.switchTo().window(ss[2]);
  WebElement one = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/a/button"));
 one.click();

  
  
	
		
		
		
		
		
	}

}

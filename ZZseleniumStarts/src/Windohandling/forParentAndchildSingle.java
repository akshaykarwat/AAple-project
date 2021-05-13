package Windohandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forParentAndchildSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		  String parentID = driver.getWindowHandle();
		  System.out.println(parentID);
		  
		  driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/a")).click();
		      Set<String> pc = driver.getWindowHandles();
		      for(   String allpc  : pc) {
		    	  if(!(parentID.equals(allpc))) {
//		    		driver.switchTo().window(allpc);
//		    		  driver.navigate().to("https://www.google.com");
		    	  }
		    	  driver.switchTo().defaultContent();
		    	  driver.navigate().to("https://www.facebook.com");
		      
		  
		  
		  
		      }
	}

}

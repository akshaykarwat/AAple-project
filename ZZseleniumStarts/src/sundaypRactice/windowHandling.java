package sundaypRactice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		      String parent = driver.getWindowHandle();
		      System.out.println(parent);
		      
		   WebElement child = driver.findElement(By.linkText("OrangeHRM, Inc"));
		        child.click();
		    Set<String> parentAchild = driver.getWindowHandles();
		       System.out.println(parentAchild);
		       
		        for(  String new4  : parentAchild   ) {
		        	if(!(parent.equals(new4))) {
		        		driver.navigate().to("https://www.flipkart.com");
		        	}
		        	driver.switchTo().window(parent);
		        	driver.get("https://www.google.com");
		        }
		        
		        
		        

	}

}

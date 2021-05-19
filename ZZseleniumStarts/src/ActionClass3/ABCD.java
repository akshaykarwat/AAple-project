package ActionClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
			
		 
		   WebDriver driver = new ChromeDriver(); 
		   driver.manage().window().maximize(); 
		  String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html"; 
		  driver.get(url); 

		     WebElement drag = driver.findElement(By.linkText("A"));
		     
		     WebElement drop=driver.findElement(By.linkText("G"));
		     Actions act=new Actions(driver);
		   //  act.dragAndDrop(drag, drop).perform();;
		     //
		     
	}

}

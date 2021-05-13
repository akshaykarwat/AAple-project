package practiceUptoWindowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbAAlldropdownprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		      List<WebElement> allstore = driver.findElements(By.xpath("//*[@id='day']//option"));
		     for(   WebElement one:allstore   ) {
		    	  String kk = one.getText();
		    	 if(kk.equals("11")) {
		    	one.click();
		    	 }
		     }
	}

}

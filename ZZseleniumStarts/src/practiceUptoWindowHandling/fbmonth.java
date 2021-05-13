package practiceUptoWindowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		List<WebElement> all = driver.findElements(By.xpath("//*[@id='month']//option"));
	
		for(  WebElement oneBYone : all   ) {
			   String allstring = oneBYone.getText();
			   if(allstring.equals("May")) {
				   oneBYone.click();
			   }
			
		}
		
	}

}

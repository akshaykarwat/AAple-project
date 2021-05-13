package practiceUptoWindowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbselctallTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		   List<WebElement> fb = driver.findElements(By.xpath("//*[@id='sex']"));
		   int i=0;
		   for( WebElement one : fb) {
			   if(i%2==0) {
				one.click(); 
			   }
			   i++;
	}
	}
}

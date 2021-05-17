package ActionClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		  WebElement parent = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		  driver.switchTo().frame(parent);
		  Actions act=new Actions(driver);
		  WebElement click = driver.findElement(By.xpath("//*[@id='slider']//span"));
		  
		
		  act.clickAndHold(click).moveByOffset(50, 0).moveByOffset(-20, 0).release().build().perform();
	}

}

package ZZZZpracticebasic;

import java.awt.Dimension;
import java.awt.geom.Dimension2D;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
	
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-1000)");
//		
		WebElement sun1 = driver.findElement(By.xpath("//iframe[@id='frame-one1434677811']"));
		driver.switchTo().frame(sun1);
		
		WebElement sunday = driver.findElement(By.xpath("//*[@for='RESULT_CheckBox-8_6']"));
		js.executeScript("arguments[0].scrollIntoView();",sunday);
		
		//js.executeScript("arguments[0].click();",sunday);
		//*[contains(@for,'RESULT_CheckBox-8_')]
		
		
	List<WebElement> WebE = driver.findElements(By.xpath("//*[contains(@for,'RESULT_CheckBox-8_')]"));
		int i=0;
		for(  WebElement one : WebE) {
			String xx = one.getText();
			System.out.println(xx);
			if(i%3==0) {
				one.click();
			}
			i++;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	

}

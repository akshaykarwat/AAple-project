package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//*[@id='frame-one1434677811']"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> random = driver.findElements(By.xpath("//*[contains(@for,'RESULT_CheckBox-8_')]"));
		int u=random.size();
		System.out.println(u);
		int i=0;               
		for(WebElement one :random) {
			if(i%2==0) {
				one.click();
			}
			i++;
			//driver.switchTo().parentFrame();
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	

}

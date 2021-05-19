package ActionClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropAndDrop123 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		driver.manage().window().maximize();
		
		   WebElement drag = driver.findElement(By.xpath("(//*[@class='ui-state-default'])[1]"));
		   
		   WebElement drop = driver.findElement(By.xpath("(//*[@class='ui-state-default'])[3]"));
		   
		   Thread.sleep(2000);
		Actions act= new Actions(driver)  ;
		//act.dragAndDrop(drag, drop).perform();
//		act.click(drag);
//		Thread.sleep(2000);
//		act.dragAndDrop(drag, drop).clickAndHold(drag).build().perform();
		
		act.clickAndHold(drag).moveByOffset(120, 0).release().build().perform();

		WebElement one = driver.findElement(By.xpath("//*[@id='sharing-button-Blog1-byline-2873846720740225467']"));
		           JavascriptExecutor js = (JavascriptExecutor)driver;
		          // js.executeScript("window.scrollBy(0,200)");
		           js.executeScript("arguments[0].scrollIntoView();", one);
		           Thread.sleep(2000);
		           
		        one.click();   
		
		
		
		
		
	}

}

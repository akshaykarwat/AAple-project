package sundaypRactice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragAdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		 WebElement op =driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(op);
		
		 WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
		 
		 WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
	
	}

}

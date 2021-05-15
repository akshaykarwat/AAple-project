package ACtionClass2NdDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropAnDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		 WebElement parent =driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(parent);
		
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().parentFrame();

	}

}

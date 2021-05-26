package zzzzpractice11111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drag1 = driver.findElement(By.xpath("(//*[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		WebElement drag2=driver.findElement(By.xpath("(//*[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]"));
		
		Actions act=new Actions(driver);
		WebElement drop=driver.findElement(By.xpath("//*[@class='ui-widget-content ui-state-default ui-droppable']"));
		act.dragAndDrop(drag1, drop).perform();
		act.dragAndDrop(drag2, drop).perform();
		
		
		 WebElement a1 = driver.findElement(By.xpath("//*[@id=\"trash\"]/ul/li/a"));
		act.click(a1).perform();
		
		

	}

}

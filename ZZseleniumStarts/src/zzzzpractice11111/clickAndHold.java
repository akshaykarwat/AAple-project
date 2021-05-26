package zzzzpractice11111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {

	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

Actions act= new Actions(driver);
 WebElement click = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
act.clickAndHold(click).moveByOffset(150,0).build().perform();
Thread.sleep(2000);
act.clickAndHold(click).moveByOffset(-150,0).build().perform();


     WebElement one = driver.findElement(By.xpath("//*[@id='speed']"));
     act.sendKeys(one, Keys.DOWN).sendKeys(one,Keys.DOWN).click(one).build().perform();
     
	}

}

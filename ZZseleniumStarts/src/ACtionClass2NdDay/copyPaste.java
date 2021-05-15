package ACtionClass2NdDay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mbasic.facebook.com/reg");
driver.manage().window().maximize();

            WebElement one = driver.findElement(By.xpath("(//*[@name='firstname'])"));
            Actions act=new Actions(driver);
act.sendKeys("Akshay").keyDown(one,Keys.CONTROL).sendKeys("a").keyUp(one, Keys.CONTROL).build().perform();

act.keyDown(one,Keys.CONTROL).sendKeys("c").keyUp(one,Keys.CONTROL).build().perform();
WebElement two=driver.findElement(By.xpath("//*[@name='lastname']"));
two.click();
act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
driver.quit();
	}

}

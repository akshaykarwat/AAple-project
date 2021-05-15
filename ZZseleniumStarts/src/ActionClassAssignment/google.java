package ActionClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	Actions act=new Actions(driver);
		
		WebElement printGoogle=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		act.sendKeys("chris gayle").sendKeys(printGoogle, Keys.DOWN).sendKeys(printGoogle, Keys.DOWN).sendKeys(printGoogle, Keys.DOWN).click(printGoogle).build().perform();
		 
		WebElement enter=driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
		act.click(enter).perform();

}
}
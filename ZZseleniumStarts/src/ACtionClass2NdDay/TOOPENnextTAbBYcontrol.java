package ACtionClass2NdDay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TOOPENnextTAbBYcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
     WebElement ONE = driver.findElement(By.linkText("Forgot your password?"));
     Actions act= new Actions(driver);
     act.keyDown(Keys.CONTROL).click(ONE).build().perform();
	}

}

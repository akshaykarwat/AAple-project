package ActionClassAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginToHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement ID = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		ID.sendKeys("Admin");
		act.sendKeys(ID, Keys.TAB).perform();

		WebElement Password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		Password.sendKeys("admin123");
		act.sendKeys(Password, Keys.ENTER).perform();

		WebElement clickAdmin = driver.findElement(By.linkText("Admin"));
		act.moveToElement(clickAdmin).perform();
		act.click(clickAdmin).perform();

		WebElement PIm = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
		PIm.click();

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_2\"]"));
        act.click(checkbox).contextClick(checkbox).build().perform();
        
        
        
	}
}
package ActionClassAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assighnmentHower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Actions act=new Actions(driver);
		//tab+sendkey+enter+buid+perform
		WebElement username=driver.findElement(By. xpath("//*[@name='txtUsername']"));
		username.sendKeys("Admin");
		act.sendKeys(username, Keys.TAB).sendKeys("admin123").sendKeys(username, Keys.ENTER).build().perform();
		//hower
		WebElement hOwer=driver.findElement(By.linkText("Admin"));
		act.moveToElement(hOwer).perform();
		//hower
		WebElement user=driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
		act.moveToElement(user).perform();
		
		//hower
		WebElement userlast=driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']"));
		act.moveToElement(userlast).click(userlast).perform();
		
		
		//"C:\Users\akshay\Downloads\selenium\chromedriver.exe"
	}

}

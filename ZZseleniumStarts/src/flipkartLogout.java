import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartLogout {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("8668808188");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Flipkart@1707");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();

		Actions act = new Actions(driver);

		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("(//*[@class='exehdJ'])[1]"));
		Thread.sleep(2000);
		
		act.moveToElement(click).click().build().perform();
		Thread.sleep(2000);
		click.click();
		//act.sendKeys(Keys.TAB).perform();
		
		driver.findElement(By.linkText("Logout")).click();
	}

}

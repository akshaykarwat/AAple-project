package dropdownDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	WebElement happy=driver.findElement(By.xpath("//*[@id='day']"));
	Select dropdown= new Select(happy) ;
	dropdown.selectByVisibleText("10");
	
	
	WebElement birth=driver.findElement(By.xpath("//*[@id='month']"));
	Select akshay= new Select(birth) ;
	akshay.selectByIndex(5);
	
	
	WebElement day=driver.findElement(By.xpath("//*[@id='year']"));
	Select days= new Select(day) ;
	days.selectByValue("1998");
	
	
	}

}

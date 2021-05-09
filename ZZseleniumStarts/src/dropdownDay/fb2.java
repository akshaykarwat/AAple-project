package dropdownDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	WebElement day=driver.findElement(By.xpath("//*[@id='month']"));
	Select dropdown= new Select(day) ;
	dropdown.selectByIndex(5);
	}



	}



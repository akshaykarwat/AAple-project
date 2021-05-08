package dropdownDay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownOfFb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	
		List<WebElement> fbdate = driver.findElements(By.xpath("//*[@id='day']//option"));
		for( WebElement oks :  fbdate) {
			 String op=oks.getText();
			 System.out.println(op);//date
			 if(op.equals("2")) {
			oks.click();	 
			 }
		}
	}

}

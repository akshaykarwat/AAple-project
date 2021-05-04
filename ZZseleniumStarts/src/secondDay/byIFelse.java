package secondDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class byIFelse {
static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	//String s="browser";	
	String s="mozila";
		
	if(s.equals("browser")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		  driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}else if (s.equals("mozila")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\akshay\\Downloads\\selenium\\geckodriver (1).exe");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}else {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
		
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
WebElement username=driver.findElement(By.id("txtUsername"));
username.sendKeys("Admin");

WebElement Password=driver.findElement(By.id("txtPassword"));
Password.sendKeys("admin123");

WebElement submit =driver.findElement(By.name("Submit"));
Thread.sleep(10000);
submit.click();
driver.close();

	}

}

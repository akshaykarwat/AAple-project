package ZZZpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginWithGmail {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(gamil.read(0,0));
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();

	}

}

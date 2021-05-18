import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPgrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"heroText2\"]/div/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/div/span")).click();
	}

}

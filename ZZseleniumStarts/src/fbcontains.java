import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbcontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		// [//a[@class='_14Me7y'] ] //New to flipkart xpath
		//// a[contains(@class,'_14Me')] contains xpath

		// he chalnar nai and ahe donhi match pahije
		// driver.findElement(By.xpath("//input[@type='tex' and @class='_2IX_2-
		// VJZDxU']")).sendKeys("omkarkankekar@gmail.com");

		// or
		// input[@type='tex' or @class='_2IX_2- VJZDxU']
		driver.findElement(By.xpath("//input[@type='tex' or @class='_2IX_2- VJZDxU']"))
				.sendKeys("omkarkankekar@gmail.com");

		// he chalnar nai and ahe donhi match pahije
		// "//input[@type='pass' and @class='_2IX_2- _3mctLh VJZDxU']"
		// for and
		// "//input[@type='passWord' and @class='_2IX_2- _3mctLh VJZDxU']"//true
		// or
		driver.findElement(By.xpath("//input[@type='pass'  or @class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("omkar4456");
		
		
		//by contaiins
		
		//driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l _2HKlqd ')])[1]")).click();
	}

}

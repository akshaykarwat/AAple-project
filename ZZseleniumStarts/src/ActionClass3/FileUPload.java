package ActionClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUPload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/zzzzzpractice/zzzzzpractice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		 WebElement parent = driver.findElement(By.xpath("//*[@name='upload']"));
		 parent.sendKeys("C:\\Users\\akshay\\Desktop\\~$oject poster 15-16-1.docx");
	}

}

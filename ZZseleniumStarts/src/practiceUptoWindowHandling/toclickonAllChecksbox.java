package practiceUptoWindowHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toclickonAllChecksbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath(" //*[@id='btnLogin']")).click();
		driver.findElement(By.linkText("PIM")).click();
		
		  List<WebElement> allsTORE = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));
		     int u =allsTORE.size();
		     System.out.println(u);
		    int  i=0;
		for(     WebElement one :allsTORE  ) {
			one.click();
			//if(i%2==0) {
			
		//if(i%5==0) {
				//one.click();
			}
			i++;
		}
		     
	}



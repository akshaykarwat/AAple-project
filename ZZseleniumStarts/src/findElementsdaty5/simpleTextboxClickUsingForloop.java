package findElementsdaty5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleTextboxClickUsingForloop {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.navigate().refresh();

driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//input[@name='Submit' or @id='btn']")).click();

driver.findElement(By.xpath("//b[text()='Admin']")).click();


//Here is da for loop
for( int i=0;i<=3;i++) {
driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_61' and @name='chkSelectRow[]']")).click();
driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_60' or @name='[]']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_61' and @name='chkSelectRow[]']")).click();
driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_60' or @name='[]']")).click();
driver.navigate().back();
driver.navigate().back();
}
	}

}

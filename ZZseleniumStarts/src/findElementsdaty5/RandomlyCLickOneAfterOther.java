package findElementsdaty5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomlyCLickOneAfterOther {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit' or @id='btn']")).click();

		driver.findElement(By.xpath("//b[text()='Admin']")).click();

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
		int u = checkbox.size();
		System.out.println("number of checkboxes"+u);
		int i=0;
	for (WebElement chekes : checkbox) {
		
		if(i%5==0) {
			chekes.click();
	
}
		i++;
	}

				
					
	} 

}

			

		
	


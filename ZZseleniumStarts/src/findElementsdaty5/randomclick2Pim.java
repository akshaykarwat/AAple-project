package findElementsdaty5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class randomclick2Pim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		
		driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit' or @id='btn']")).click();
		driver.findElement(By.xpath("//a[contains(@id,'menu_pim_viewPimModule')]")).click();

		
		
		 List<WebElement> store = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
		 int k= store.size();
		 System.out.println("The size is"+k);
		 int i=0;
		for( WebElement print  : store  ) {
			//1 3 5
			if(i%2!=0) {//if(i%2==0)0 2 4
				print.click();
			}
			i++;
			
			
		}
	
	}


}
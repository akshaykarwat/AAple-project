package sundaypRactice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class doutwindoHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		      String parent = driver.getWindowHandle();
		      System.out.println(parent);
		      
		   WebElement child = driver.findElement(By.linkText("OrangeHRM, Inc"));
		        child.click();
		        child.click();
		        child.click();
		       Set<String> parentAchill = driver.getWindowHandles();
		            int one = parentAchill.size();
		            String[] s=new String[one];
		            int i=0;
		            for(  String id :   parentAchill) {
		            	s[i]=id;
		            	i++;
		            }
		            driver.switchTo().window(s[3]);
		            driver.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[3]/li[4]/a")).click();
		            
		          
		            
		            
	}

}

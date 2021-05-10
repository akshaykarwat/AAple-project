import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orhmDropdownPRINTpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().fullscreen();
driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");

driver.findElement(By.xpath(" //*[@id='btnLogin']")).click();

driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();

     List<WebElement> click = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord')]"));
    int u= click.size();
     System.out.println(" the size is of webElement is"+u);
     
    int i=0;
     for( WebElement store : click ) {
    	 if(i%3==0) {
    		 store.click();
    	 }
    	 ++i;
    	 driver.close();
     }
	}

}
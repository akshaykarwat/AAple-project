import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toPrintallDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");

		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().fullscreen();
driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");

driver.findElement(By.xpath(" //*[@id='btnLogin']")).click();

driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();

  List<WebElement> selected = driver.findElements(By.xpath("//*[@id='candidateSearch_modeOfApplication']//option"));
for(   WebElement T   :   selected      ) {
	String xx=   T.getText();
	System.out.println(xx);
	if(xx.equals("Manual")) {
	T.click();
	driver.quit();
}

	}
	}
}

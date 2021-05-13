import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath(" //*[@id='btnLogin']")).click();
driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b")).click();
        List<WebElement> All = driver.findElements(By.xpath("//*[@id='searchDirectory_job_title']//option"));
        
         for( WebElement   one :  All) {
    String allhere = one.getText();
    System.out.println(allhere);
       	 if(allhere.equals("Account Assistant")){
       		one.click();
       	 }
           
	}
         
}
}
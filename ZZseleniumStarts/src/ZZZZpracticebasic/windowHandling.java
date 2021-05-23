package ZZZZpracticebasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowHandling {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		    String  a1=driver.getWindowHandle();
		    System.out.println(a1);
		    
		driver.findElement(By.xpath("//*[@id='Covid19info']")).click();
		driver.findElement(By.xpath("//*[@id='Covid19info']")).click();
		driver.findElement(By.xpath("//*[@id='Covid19info']")).click();

		   Set<String> a2 = driver.getWindowHandles();
		   int count =a2.size();
		  System.out.println(count);
		   String [] s=new String[count];
		 
		   int i=0;
		   for( String one:a2) {
			   
			   s[i]=one;
			   i++;
		   }
		  
		   driver.switchTo().window(s[1]);
		//driver.findElement(By.xpath("//*[text()=' TRAVEL GUIDELINES ']")).click();
		driver.navigate().to("https:\\www.google.com");
	}

}

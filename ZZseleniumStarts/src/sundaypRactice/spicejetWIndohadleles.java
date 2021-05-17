package sundaypRactice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejetWIndohadleles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
	
		  String one1 = driver.getWindowHandle();
		  System.out.println(one1);
		  
		  WebElement x= driver.findElement(By.linkText("Covid-19 Information"));
		  x.click();
		 WebElement y= driver.findElement(By.linkText("Covid-19 Information"));
		 y.click();
		  
		        Set<String> two = driver.getWindowHandles();
		              int xx = two.size();
		              System.out.println(xx);
		              String a[]=new String[xx];
		              int i=0;
		        for(  String one  : two   ) {
		        	a[i]=one;
		        	i++;	
		        }
         driver.switchTo().window(a[1]);
         driver.findElement(By.xpath("//*[@id=\"highlight-book\"]")).click();
		  
		   
		   
	}

}

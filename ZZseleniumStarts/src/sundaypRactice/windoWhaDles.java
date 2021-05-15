package sundaypRactice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windoWhaDles {

	

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
		    Set<String> parentAchild = driver.getWindowHandles();
		                     int Allid = parentAchild.size();
		                     String[]a=new String[Allid];
		                     int i=0;
		                     for(  String one :parentAchild){
		                    	  a[i]=one;
		                    	  i++;
		                    	 
		                    	
		                     }
		                    		 driver.switchTo().window(a[2]);
		                    		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/a/button")).click();
		                    		 
		       
		       
		       
		        
		        
		        

	}

}

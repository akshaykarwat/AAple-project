package PopUp;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPgrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"heroText2\"]/div/div/div")).click();
		    //driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div[2]/div/span")).click();
		List<WebElement> ss = driver.findElements(By.xpath("//div[@class='lc723RightDiv']"));
//		Iterator<WebElement> ps = ss.iterator();
//
//		while(ps.hasNext())
//		{
//			String pp = ps.next().getText();
//			
//			System.out.println(pp);
		
//			}
		
		for(WebElement s1:ss) {
			String s2 = s1.getText();
			System.out.println(s2);
		}
	}
	
	
	

}

package sundaypRactice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToRunOnmutlipleBrowser {
   static WebDriver driver;
	public static void main(String[] args) {
		String s="chrome";
		String m=" mozzila";
		if(s.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(" https://www.google.com");
		}
		if(m.equals("mozzila")) {
			System.setProperty("webdriver.gecko.driver", "F:\\poco f1\\selenium\\geckodriver (1).exe");
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
		
		
	}

}

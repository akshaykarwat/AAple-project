package secondDay;

import org.openqa.selenium.chrome.ChromeDriver;

public class inspect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	driver.navigate().refresh();
driver.get("https://www.facebook.com");
driver.navigate().back();
driver.navigate().forward();
driver.close();
	
	
	}

}

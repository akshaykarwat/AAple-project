package FristDay;

import org.openqa.selenium.firefox.FirefoxDriver;

public class mozila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\akshay\\Downloads\\selenium\\geckodriver (1).exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	}

}

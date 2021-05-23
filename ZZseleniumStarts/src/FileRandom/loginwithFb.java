package FileRandom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginwithFb {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
String path=System.getProperty("user.dir")+"\\config.properties";
FileInputStream src=new FileInputStream(path);
Properties prop=new Properties();
prop.load(src);
driver.get(prop.getProperty("testSiteurl1"));

    String s1=prop.getProperty("testSiteurl1");
    System.out.println(s1);
    
    String s2=prop.getProperty("username1");
    System.out.println(s2);
    
    String s3=prop.getProperty("password1");
    System.out.println(s3);
    
    driver.findElement(By.xpath("//*[@type='text']")).sendKeys(prop.getProperty("username1"));
    driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password1"));

    driver.findElement(By.xpath("//*[@type='submit']")).click();
    
    
    
    
    
    
    
	}

}

package FileRandom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.hwpf.usermodel.ParagraphProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomDataChange {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		File file = new File(System.getProperty("user.dir") + "\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty("testsiteurl");
		System.out.println(value);

		String id = prop.getProperty("username");
		System.out.println(id);

		String password1 = prop.getProperty("password");
		System.out.println(password1);

		

		driver.get(prop.getProperty("testsiteurl"));
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(prop.getProperty("username"));

		WebElement Password = driver.findElement(By.id("txtPassword"));
		Password.sendKeys(prop.getProperty("password"));

		WebElement submit = driver.findElement(By.name("Submit"));
		Thread.sleep(10000);
		submit.click();
		driver.close();

	}

}

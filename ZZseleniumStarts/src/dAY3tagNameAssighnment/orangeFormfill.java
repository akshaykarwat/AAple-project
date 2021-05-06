package dAY3tagNameAssighnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orangeFormfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
WebElement username=driver.findElement(By.id("txtUsername"));
username.sendKeys("Admin");

WebElement Password=driver.findElement(By.id("txtPassword"));
Password.sendKeys("admin123");

WebElement submit =driver.findElement(By.name("Submit"));
submit.click();

driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();

driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).clear();
driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys(" Akshay karwatkar");



Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]")));
dropdown.selectByVisibleText("Indian");
//dropdown.deselectByIndex(82);
driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

	}

}

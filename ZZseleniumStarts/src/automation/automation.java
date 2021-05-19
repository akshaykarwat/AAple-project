package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class automation {

	public static void main(String[] args) throws InterruptedException, Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
//scroll upto particular limit
		WebElement a1 = driver.findElement(By.xpath("//*[@id='age']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", a1);

		Thread.sleep(2000);
//scroll up
		WebElement a11=driver.findElement(By.xpath("//*[@id='age']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
//scroll down
		js.executeScript("window.scrollBy(0,1000)");
		
//drag and drop
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//*[text()='Drop here']"));
		act.dragAndDrop(drag, drop).perform();
//click and hold
		Thread.sleep(2000);
		WebElement clickHand = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		act.clickAndHold(clickHand).moveByOffset(50, 0).build().perform();
//double click
		WebElement doubleclicka = driver.findElement(By.xpath("//*[@ondblclick='myFunction1()']"));
		act.doubleClick(doubleclicka).perform();

//TO save in same directory
		TakesScreenshot src = (TakesScreenshot) driver;
		File source = src.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "\\SsScreenshot\\ats.png";
		File destination = new File(path);
		FileHandler.copy(source, destination);
//To save in External folder		
		TakesScreenshot src1 = (TakesScreenshot) driver;
		File source1 = src.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\akshay\\Desktop\\akshay\\ghansham.png");
		FileHandler.copy(source1, destination1);
//iframe will be their	
		WebElement iframe = driver.findElement(By.xpath("//*[@id='frame-one1434677811']"));
		driver.switchTo().frame(iframe);
//fILL All
		 WebElement click = driver.findElement(By.xpath("//*[@name='RESULT_TextField-1']"));
		 click.sendKeys("akshay");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

//filling value
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("9588615643");
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("india");
       driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-5\"]")).sendKeys("warora");
       driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-6\"]")).sendKeys("akshaykarwatkar@gmail.com");
       WebElement isSlected = driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label"));
       isSlected.click();
       Thread.sleep(2000);
       boolean isSlected1 = driver.findElement(By.xpath("//*[@id=\"q26\"]/table/tbody/tr[1]/td/label")).isSelected();
//tp click random checkbox
driver.findElement(By.xpath("//*[@id=\"q15\"]/table/tbody/tr[3]/td/label")).click();

//dropdown
     
Select dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-9\"]")));
dropdown.selectByVisibleText("Morning");

//to SEnd file
driver.findElement(By.xpath("//*[@id=\"RESULT_FileUpload-10\"]")).sendKeys("C:\\Users\\akshay\\Desktop\\Selenium Basics.docx");

//random click

	}

}

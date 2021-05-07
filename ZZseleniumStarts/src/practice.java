import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
	boolean sss=	driver.findElement(By.xpath("//*[@id=\"reg_home_frm\"]/div[2]/div")).isSelected();
	System.out.println(sss);
		Thread.sleep(2000);
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id=\"ddlReligion\"]")));
		dropdown.selectByIndex(1);
		
		
	}

}

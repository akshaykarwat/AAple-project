package FristDay;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Downloads\\selenium\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fb%2F%3Fnode%3D20338496011%26pf_rd_r%3DGF64701V99XKBEG8H2RG%26pf_rd_p%3D3958b901-1980-474c-ab9f-2a46a22ba202%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
driver.findElement(By.id("ap_email")).sendKeys("9763868370");
driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Wardha@123");
	driver.findElement(By.id("signInSubmit")).click();
}
}
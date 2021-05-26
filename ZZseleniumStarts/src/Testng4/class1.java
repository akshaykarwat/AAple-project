package Testng4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 {

	@Test(priority=-2)
	public void m1() {
		Reporter.log("akshay", true);
	}
}

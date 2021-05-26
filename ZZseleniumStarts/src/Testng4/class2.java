package Testng4;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 {

	@Test(priority=-3)
	public void m2() {
		Reporter.log("rajesh", true);
	}
	
	

}


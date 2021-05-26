package Testng1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class scecondclass {

	@AfterTest
	public void m4() {
		Reporter.log("after test", true);
	}

	@AfterSuite
	public void m2() {
		Reporter.log("after suite", true);
	}

	@Test(priority=-2)
	public void k1() {
		Reporter.log("test1 case from 2ND",true);
	}

	
	@AfterMethod
	public void k3() {
		Reporter.log("after method",true);
	}

	@AfterClass
	public void k4() {
		Reporter.log("after class",true);
	}

}

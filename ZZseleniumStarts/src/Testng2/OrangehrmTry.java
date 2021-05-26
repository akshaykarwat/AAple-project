package Testng2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangehrmTry {

	@BeforeSuite
	public void m1() {
		//Reporter.log("before suit",true);
		
	System.out.println("browser gets open");
	}
	
	@AfterSuite
	public void m2() {
	//	Reporter.log("after suite", true);
		System.out.println("browser gets shutdown");
	}


	@AfterTest
	public void m4() {
		//Reporter.log("after test", true);
		System.out.println("navigate back to orignal url");
	}

	
	@BeforeTest
	public void m3() {
		//Reporter.log("before test", true);
		System.out.println("navigate to particular task");

	}
	
	@Test
	public void testcase() {
		System.out.println("testinf of specific functionality");
	}
		
	
	@AfterMethod
	public void m6() {
		//Reporter.log("before method", true);
		System.out.println("at starting point");
	}	
	
	@BeforeMethod
	public void m7() {
		//Reporter.log("after method", true);
		System.out.println("at spefic page");
	}	

	@BeforeClass
	public void m11() {
		//Reporter.log("before class", true);
		System.out.println("login into application");
	}	
	@AfterClass
	public void m12() {
		//Reporter.log("after class", true);
		System.out.println("logged out from application");
	}
		
		
		
	

}

package Testng1;

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

public class fristclass {

	
@BeforeSuite
public void m1() {
	Reporter.log("before suit",true);
}


@BeforeTest
public void m3() {
	Reporter.log("before test", true);
}
	

	
@BeforeMethod
public void m5() {
	Reporter.log("before method", true);
}	


@Test(priority=0)
public void m8() {
	Reporter.log("0st test case",true);
}

@Test(priority=-1)
public void m10() {
	Reporter.log("1st test case",true);
}

@Test(enabled=false)
public void akshay() {
	Reporter.log("1st test case");
}



@AfterMethod
public void m6() {
	Reporter.log("after method", true);
}	

@BeforeClass
public void m11() {
	Reporter.log("before class", true);
}	
@AfterClass
public void m12() {
	Reporter.log("after class", true);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

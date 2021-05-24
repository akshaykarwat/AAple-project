package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class oneTest {
	
	@AfterClass
	public static void else7() {
		Reporter.log("it will runn afterclass", true);
	}
	
	
	@BeforeClass
	public static void else1() {
		Reporter.log("i am always top", true);
	}

	@AfterMethod
	public static void else5() {
		Reporter.log("after method", true);
	}

	@Test
	public static void else2() {
		Reporter.log("it will run 3rd ", true);
	}
	
	@Test(enabled=false)
	public static void else10() {
		Reporter.log("it will run 1st fifth", true);
	}

	@Test(priority = -1)
	public static void else3() {
		Reporter.log("this will run 2nd ", true);
	}

	@Test(priority = -2)
	public static void else4() {
		Reporter.log("this will run frist ", true);
	}
	@BeforeMethod
	public static void else6() {
		Reporter.log("i am awlys brfore method", true);
	}


}

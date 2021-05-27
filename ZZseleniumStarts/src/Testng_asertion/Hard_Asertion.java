package Testng_asertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Hard_Asertion {
	// stop if when failed once it stops testcase//remainig code not executed

	@Test
	public void testcase1() {
		String expectedmessage = "Login done";

		Reporter.log("test case1 executed", true);
		String actualmessage = "Loggin done";
		// Assert.assertEquals(actualmessage, expectedmessage);
		Assert.assertEquals(actualmessage, expectedmessage, "abe brobr kr");
	}

	@Test
	public void testcase2() {
		Reporter.log("test case2 executed", true);
		Assert.assertEquals(10.22, 85.4, "double b nai yet tule");
	}

	@Test
	public void testcase3() {
		Reporter.log("test case3 executed", true);
		Assert.assertEquals(10.22, 85.4, "double b nai yet tule");
	}

	@Test
	public void testcase4() {
		Reporter.log("test case4 executed", true);

		boolean isSelected = true;
		Assert.assertEquals(isSelected, true, "bully is true");
	}

	@Test
	public void testcase5() {
		Reporter.log("test case5 executed", true);

		Assert.assertTrue(false, "aur yha pe galat hote huye");
	}

	@Test
	public void testcase6() {
		Reporter.log("test case6 executed", true);
		// short wala
		Assert.assertEquals(100, 10000);
	}

	@Test
	public void testcase7() {
		Reporter.log("test case7 executed", true);
		System.out.println("before assert");
		Assert.assertEquals(1000, 100000, "ye b hag diye");
		System.out.println("after assert");

	}

	@Test
	public void testcase8() {
		SoftAssert sa=new SoftAssert();
		Reporter.log("test 8", true);
		System.out.println("before asert");
		sa.assertEquals(100, 100, "lets run");
		System.out.println("after asert");
		sa.assertAll();

	}

}
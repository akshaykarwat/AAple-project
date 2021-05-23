package Testng;

import org.testng.annotations.Test;

public class testy {

	
	@Test(priority=1,invocationCount=5)
	public void login() {
		System.out.println("test case is pass");
	}
	@Test(priority=2)
	public void Homepage() {
		System.out.println("test case is pass");
	}
	
	@Test(priority=-2)
	public void Homepage4() {
		System.out.println("test case is pass");
	}
	@Test(priority=-1)
	public void Homepage5() {
		System.out.println("test case is pass");
	}
	
	
	

}

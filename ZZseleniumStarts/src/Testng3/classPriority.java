package Testng3;

import org.testng.annotations.Test;

public class classPriority {

	@Test
	public void akshay() {
		System.out.println("akshay method");
	}

	@Test
	public void omkar() {
		System.out.println("omkar method");
	}

	@Test
	public void pratik() {
		System.out.println("pratik method");
	}

	@Test(priority = -1)
	public void surkar() {
		System.out.println("surkaar method");
	}

	@Test(priority = 1)
	public void yogesh() {
		System.out.println("yogesh method");
	}

}

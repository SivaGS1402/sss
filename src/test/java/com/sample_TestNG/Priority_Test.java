package com.sample_TestNG;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test(groups = {"test1"},priority = 0)
	public void firstTestCase() {
		System.out.println("This is ths 1st Test case");
	}

	@Test(priority = 1)
	public void secondTestCase() {
		System.out.println("This is ths 2nd Test case");
	}

	@Test(priority = 2)
	public void thirdTestCase() {
		System.out.println("This is ths 3rd Test case");
	}

	@Test(groups = {"test2"},priority = 3)
	public void fourthTestCase() {
		System.out.println("This is ths 4th Test case");
	}

	@Test(priority = 4)
	public void fifthTestCase() {
		System.out.println("This is ths 5th Test case");
	}

}

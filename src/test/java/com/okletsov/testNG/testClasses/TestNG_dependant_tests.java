package com.okletsov.testNG.testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testNG.appCode.SomeClassToTest;

public class TestNG_dependant_tests {

	SomeClassToTest obj;

	@BeforeClass
	public void setUp(){
		System.out.println("\nTestNG_dependant_tests: This runs once before class");
		obj = new SomeClassToTest();
	}

	@AfterClass
	public void tearDown(){
		System.out.println("TestNG_dependant_tests: This runs once after class");
	}

	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod1(){
		System.out.println("TestNG_dependant_tests: Running testMethod1");
	}

	@Test
	public void testMethod2(){
		System.out.println("TestNG_dependant_tests: Running testMethod2");
		int result = obj.sumNumbers(1,2);
		Assert.assertEquals(result, 2);
	}

	@Test(dependsOnMethods = {"testMethod1"}, alwaysRun = true)
	public void testMethod3(){
		System.out.println("TestNG_dependant_tests: Running testMethod3");
	}

	@Test
	public void testMethod4(){
		System.out.println("TestNG_dependant_tests: Running testMethod4");
	}
}

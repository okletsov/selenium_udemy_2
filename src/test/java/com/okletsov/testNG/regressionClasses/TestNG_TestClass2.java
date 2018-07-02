package com.okletsov.testNG.regressionClasses;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass2 extends BaseTestSuite {
	@BeforeClass
	public void setUp(){
		System.out.println("\nTestClass2: This runs once before class");
	}

	@AfterClass
	public void tearDown(){
		System.out.println("TestClass2: This runs once after class");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("TestClass2: This runs before every method");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("TestClass2: This runs after every method");
	}

	@Test
	public void testMethod3(){
		System.out.println("TestClass2: Running testMethod3");
	}

	@Test
	public void testMethod4(){
		System.out.println("TestClass2: Running testMethod4");
	}
}

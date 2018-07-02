package com.okletsov.testNG.testClasses;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNG_ReportsAndLogs {
	@BeforeClass
	public void setUp(){
//		System.out.println("\nTestNG_ReportsAndLogs: This runs once before class");
		Reporter.log("TestNG_ReportsAndLogs: This runs once before class", true);
	}

	@AfterClass
	public void tearDown(){
//		System.out.println("TestNG_ReportsAndLogs: This runs once after class");
		Reporter.log("TestNG_ReportsAndLogs: This runs once after class", true);
	}

	@BeforeMethod
	public void beforeMethod(){
//		System.out.println("TestNG_ReportsAndLogs: This runs before every method");
		Reporter.log("TestNG_ReportsAndLogs: This runs before every method", true);
	}

	@AfterMethod
	public void afterMethod(){
//		System.out.println("TestNG_ReportsAndLogs: This runs after every method");
		Reporter.log("TestNG_ReportsAndLogs: This runs after every method", true);
	}

	@Test
	public void testMethod1(){
//		System.out.println("TestNG_ReportsAndLogs: Running testMethod1");
		Reporter.log("TestNG_ReportsAndLogs: Running testMethod1", true);
	}

	@Test
	public void testMethod2(){
//		System.out.println("TestNG_ReportsAndLogs: Running testMethod2");
		Reporter.log("TestNG_ReportsAndLogs: Running testMethod2", true);
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = {"testMethod2"})
	public void testMethod3(){
//		System.out.println("TestNG_ReportsAndLogs: Running testMethod2");
		Reporter.log("TestNG_ReportsAndLogs: Running testMethod2", true);
		Assert.assertTrue(false);
	}
}

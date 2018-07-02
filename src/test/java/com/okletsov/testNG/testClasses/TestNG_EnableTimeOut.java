package com.okletsov.testNG.testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_EnableTimeOut {
	@BeforeClass
	public void setUp(){
		System.out.println("\nTestNG_EnableTimeOut: This runs once before class");
	}

	@AfterClass
	public void tearDown(){
		System.out.println("TestNG_EnableTimeOut: This runs once after class");
	}

	@Test(enabled = false)
	public void testMethod1(){
		System.out.println("TestNG_EnableTimeOut: Running testMethod1");
	}

	@Test(timeOut = 2000)
	public void testMethod2() throws Exception{
		System.out.println("TestNG_EnableTimeOut: Running testMethod2");
		Thread.sleep(3000);
	}
}

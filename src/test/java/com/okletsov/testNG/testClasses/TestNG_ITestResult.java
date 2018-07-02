package com.okletsov.testNG.testClasses;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_ITestResult {
	@Test
	public void testMethod1(){
		System.out.println("TestNG_ITestResult: Running testMethod1");
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod2(){
		System.out.println("TestNG_ITestResult: Running testMethod2");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterDemo(ITestResult testResult){
		if(testResult.getStatus()== ITestResult.FAILURE){
			System.out.println("Failed: " + testResult.getMethod().getMethodName());
		} else if (testResult.getStatus()== ITestResult.SUCCESS){
			System.out.println("Succeed:" + testResult.getName());
		}
	}
}

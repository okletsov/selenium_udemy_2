package testNG.regressionClasses;

import base.BaseTestSuite;
import org.testng.annotations.*;

public class TestNG_TestClass1 extends BaseTestSuite{
	@BeforeClass
	public void setUp(){
		System.out.println("\nTestClass1: This runs once before class");
	}

	@AfterClass
	public void tearDown(){
		System.out.println("TestClass1: This runs once after class");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("TestClass1: This runs before every method");
	}

	@AfterMethod
	public void afterMethod(){
		System.out.println("TestClass1: This runs after every method");
	}

	@Test
	public void testMethod1(){
		System.out.println("TestClass1: Running testMethod1");
	}

	@Test
	public void testMethod2(){
		System.out.println("TestClass1: Running testMethod2");
	}
}
